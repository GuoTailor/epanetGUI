package com.example.demo.simplify;

import com.example.demo.draw.TestFrame;
import com.example.demo.model.*;
import org.springframework.beans.BeanUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by GYH on 2021/9/13
 */
public class SimpleNetwork {
    private final CodeGenerate codeGenerate = new CodeGenerate();

    public void simplify(NetworkDataInfo data, TestFrame draw) throws InterruptedException {
        LinkedList<SimpleNode> allNode = new LinkedList<>();
        LinkedList<SimpleLink> allLink = new LinkedList<>();
        data.points.forEach(p -> allNode.add(new SimpleNode(p)));
        data.pools.forEach(p -> allNode.add(new SimpleNode(p)));
        data.reservoirs.forEach(p -> allNode.add(new SimpleNode(p)));
        data.pipes.forEach(p -> allLink.add(new SimpleLink(p)));
        data.pumps.forEach(p -> allLink.add(new SimpleLink(p)));
        data.valves.forEach(p -> allLink.add(new SimpleLink(p)));
        LinkedList<Object> simplify = new LinkedList<>();
        LinkedList<SimpleNode> queue = new LinkedList<>();

        long time = System.currentTimeMillis();
        SimpleNode first = createNetwork(allNode, allLink);
        //SimpleNode first = allNode.getFirst();
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        queue.add(first);
        System.out.println(first.code);
        while (!queue.isEmpty()) {
            SimpleNode node = queue.removeFirst();
            if (node.state == 1) continue;
            node.state = 1;
            draw.print(node);
            Thread.sleep(100);
            boolean si = isSimplify(node);
            if (si) {
                simplify.add(node.target);
                ((OcPoint) node.target).setFlag(0);
                pipSimp(node, data, draw);
                draw.draw();
            }
            for (SimpleLink link : node.links) {
                for (SimpleNode simpleNode : link.nodes) {
                    if (simpleNode.state == 0) {
                        queue.addLast(simpleNode);
                    }
                }
            }
        }
        System.out.println(System.currentTimeMillis() - time);
        draw.draw();
        deleteData(simplify, data);
    }

    public SimpleNode createNetwork(LinkedList<SimpleNode> allNode, LinkedList<SimpleLink> allLink) {
        SimpleNode firstNode = null;
        while (!allNode.isEmpty()) {
            firstNode = allNode.removeFirst();
            findLink(firstNode, allLink);
        }
        return firstNode;
    }

    public void pipSimp(SimpleNode node, NetworkDataInfo data, TestFrame draw) {
        OcPipe pipe = new OcPipe();
        LinkedList<SimpleNode> nodes = new LinkedList<>();
        double length = 0;
        String startCode = null;
        for (SimpleLink link : node.links) {
            length += ((OcPipe) link.target).getLength();
            data.pipes.removeIf(p -> {
                boolean b = p == link.target;
                if (b) {
                    ((OcPipe) link.target).setFlag(0);
//                    draw.draw();
                }
                return b;
            });
            BeanUtils.copyProperties(link.target, pipe);
            for (SimpleNode simpleNode : link.nodes) {
                if (!node.code.equals(simpleNode.code)) {
                    nodes.add(simpleNode);
                    if (simpleNode.code.equals(link.startCode)) {
                        startCode = link.startCode;
                    }
                }
            }
        }
        pipe.setLength(length);
        pipe.setCode(codeGenerate.generate());
        String finalStartCode = startCode;
        // 如果能知道起点就找起点，找不到就随机用一个点做为起点
        SimpleNode start = nodes.stream().filter(n -> n.code.equals(finalStartCode)).findFirst().orElse(nodes.getFirst());
        pipe.setStartNodeId(start.getId());
        pipe.setStartNodeCode(start.code);
        nodes.remove(start);
        SimpleNode end = nodes.getFirst();
        pipe.setEndNodeId(end.getId());
        pipe.setEndNodeCode(end.code);
        setCood(pipe, start, end);
        pipe.setFlag(1);
        start.links.removeIf(l -> node.links.contains(l));
        end.links.removeIf(l -> node.links.contains(l));
        SimpleLink e = new SimpleLink(pipe);
        e.nodes.add(start);
        e.nodes.add(end);
        start.links.add(e);
        end.links.add(e);
        //ThreadManager.getInstance().execute(() -> ocPipeService.insert(pipe));
        data.pipes.add(pipe);

    }

    public void setCood(OcPipe pipe, SimpleNode start, SimpleNode end) {
        if (start.target instanceof OcPoint) {
            OcPoint o1 = (OcPoint) start.target;
            pipe.setStartLatitude(o1.getLatitude());
            pipe.setStartLongitude(o1.getLongitude());
        } else if (start.target instanceof OcPool) {
            OcPool o1 = (OcPool) start.target;
            pipe.setStartLatitude(o1.getLatitude());
            pipe.setStartLongitude(o1.getLongitude());
        } else if (start.target instanceof OcReservoir) {
            OcReservoir o1 = (OcReservoir) start.target;
            pipe.setStartLatitude(o1.getLatitude());
            pipe.setStartLongitude(o1.getLongitude());
        }
        if (end.target instanceof OcPoint) {
            OcPoint o1 = (OcPoint) end.target;
            pipe.setEndLatitude(o1.getLatitude());
            pipe.setEndLongitude(o1.getLongitude());
        } else if (end.target instanceof OcPool) {
            OcPool o1 = (OcPool) end.target;
            pipe.setEndLatitude(o1.getLatitude());
            pipe.setEndLongitude(o1.getLongitude());
        } else if (end.target instanceof OcReservoir) {
            OcReservoir o1 = (OcReservoir) end.target;
            pipe.setEndLatitude(o1.getLatitude());
            pipe.setEndLongitude(o1.getLongitude());
        }
    }

    private boolean isSimplify(SimpleNode simpleNode) {
        boolean xsl = true;
        boolean ring = true;
        boolean material = true;
        boolean isPipe = false;
        boolean isPoint = false;
        boolean angle = true;
        if (simpleNode.links.size() == 2) {
            isPoint = !(simpleNode.target instanceof OcPool) && !(simpleNode.target instanceof OcReservoir);
            if (isPoint) {
                isPipe = simpleNode.links.stream().noneMatch(link -> (link.target instanceof OcValve) || (link.target instanceof OcPump));
                if (isPipe) {
                    // 没有形成闭环
                    SimpleLink first = simpleNode.links.getFirst();
                    SimpleLink last = simpleNode.links.getLast();
                    ring = (!Objects.equals(first.startCode, last.startCode)
                            || !Objects.equals(first.endCode, last.endCode))
                            && (!Objects.equals(first.endCode, last.startCode)
                            || !Objects.equals(first.startCode, last.endCode));
                    if (ring) {
                        // 需水量要为0
                        Object o = simpleNode.target;
                        if (o instanceof OcPoint) {
                            OcPoint o1 = (OcPoint) o;
                            if (o1.getBasicDemand() != 0.0) {
                                xsl = false;
                            }
                        }
                        if (xsl) {
                            // 材质和管径
                            OcPipe f = (OcPipe) first.target;
                            OcPipe l = (OcPipe) last.target;
                            material = Objects.equals(f.getMaterial(), l.getMaterial()) && Objects.equals(f.getDiameter(), l.getDiameter());
                            if (material) {
                                // 角度
                                OcPoint point = (OcPoint) simpleNode.target;
                                CodeNodeCoordinateResponse s = getNode(simpleNode.code, first.nodes);
                                CodeNodeCoordinateResponse e = getNode(simpleNode.code, last.nodes);
                                int degree = getDegree(point.getLongitude(), point.getLatitude(), s.getLongitude(), s.getLatitude(), e.getLongitude(), e.getLatitude());
                                angle = degree <= 8;
                            }
                        }
                    }
                }
            }
        }

        // 当前节点不能是多路汇总点
        return simpleNode.links.size() == 2
                // 不能是水池和水库
                && isPoint
                // 所连接的的管道不能是阀门和水泵
                && isPipe
                && ring
                && xsl
                && material
                && angle;
    }

    public CodeNodeCoordinateResponse getNode(String code, LinkedList<SimpleNode> nodes) {
        CodeNodeCoordinateResponse nodeCoordinate = new CodeNodeCoordinateResponse();
        Object o = nodes.stream().filter(n -> !n.code.equals(code)).findFirst().get().target;
        if (o instanceof OcPoint) {
            nodeCoordinate.setLatitude(((OcPoint) o).getLatitude());
            nodeCoordinate.setLongitude(((OcPoint) o).getLongitude());
        } else if (o instanceof OcPool) {
            nodeCoordinate.setLatitude(((OcPool) o).getLatitude());
            nodeCoordinate.setLongitude(((OcPool) o).getLongitude());
        } else if (o instanceof OcReservoir) {
            nodeCoordinate.setLatitude(((OcReservoir) o).getLatitude());
            nodeCoordinate.setLongitude(((OcReservoir) o).getLongitude());
        }
        return nodeCoordinate;
    }

    public void findLink(SimpleNode node, LinkedList<SimpleLink> allLink) {
        Iterator<SimpleLink> iterator = allLink.iterator();
        while (iterator.hasNext()) {
            SimpleLink link = iterator.next();
            if (link.startCode.equals(node.code) || link.endCode.equals(node.code)) {
                link.state++;
                link.nodes.add(node);
                node.links.add(link);
                if (link.state == 2) {
                    iterator.remove();
                }
            }
        }
    }

    public void deleteData(List<Object> simplify, NetworkDataInfo data) {
        for (Object o : simplify) {
            if (o instanceof OcPoint) {
                data.points.removeIf(p -> p == o);
            } else if (o instanceof OcPool) {
                data.pools.removeIf(p -> p == o);
            } else if (o instanceof OcReservoir) {
                data.reservoirs.removeIf(p -> p == o);
            }
        }
    }

    private static int getDegree(double vertexPointX, double vertexPointY, double point0X, double point0Y, double point1X, double point1Y) {
        //向量的点乘
        double vector = (point0X - vertexPointX) * (point1X - vertexPointX) + (point0Y - vertexPointY) * (point1Y - vertexPointY);
        //向量的模乘
        double sqrt = Math.sqrt(
                ((point0X - vertexPointX) * (point0X - vertexPointX) + (point0Y - vertexPointY) * (point0Y - vertexPointY))
                        * ((point1X - vertexPointX) * (point1X - vertexPointX) + (point1Y - vertexPointY) * (point1Y - vertexPointY))
        );
        //反余弦计算弧度
        double radian = Math.acos(vector / sqrt);
        //弧度转角度制
        return 180 - (int) (180 * radian / Math.PI);
    }
}
