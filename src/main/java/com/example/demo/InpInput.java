package com.example.demo;

import com.example.demo.draw.TestFrame;
import com.example.demo.epanet.network.Network;
import com.example.demo.epanet.network.io.input.InputParser;
import com.example.demo.epanet.network.structures.*;
import com.example.demo.model.*;
import com.example.demo.simplify.CodeGenerate;
import com.example.demo.simplify.NetworkDataInfo;
import com.example.demo.simplify.SimpleNetwork;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * Created by GYH on 2021/4/20
 */
public class InpInput {
    static Logger log = Logger.getLogger(InpInput.class.toString());
    private final CodeGenerate codeGenerate = new CodeGenerate();

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        log.info("开始");
        NetworkDataInfo dataInfo = new InpInput().inpInput("E:\\2.inp");
        TestFrame testFrame = new TestFrame();
        testFrame.start();
        log.info("显示");
        testFrame.setDataInfo(dataInfo);
        Thread.sleep(100);
        testFrame.pan.requestFocus();
        log.info("画");
        testFrame.draw();
        log.info("简化");
        new SimpleNetwork().simplify(dataInfo, testFrame);
        log.info("完成");
    }

    public NetworkDataInfo inpInput(String path) {
        Network net = new Network();
        File inFile = new File(path);
        if (!inFile.exists()) {
            log.info("File not found !");
            return null;
        }
        try {
            InputParser parserINP = InputParser.create(log);
            parserINP.parse(net, inFile);
            List<OcPoint> ocPoints = new LinkedList<>();
            List<OcPool> ocPools = new LinkedList<>();
            List<OcReservoir> ocReservoirs = new LinkedList<>();
            List<OcPipe> ocPipes = new LinkedList<>();
            List<OcPump> ocPumps = new LinkedList<>();
            List<OcValve> ocValves = new LinkedList<>();
            net.getNodes().forEach(node -> {
                if (node instanceof Tank) {
                    ocPools.add(tankToOcPool((Tank) node));
                } else if (node instanceof Reservoir) {
                    ocReservoirs.add(reservoirToOcReservoir((Reservoir) node));
                } else {
                    ocPoints.add(nodeToOcPoint(node));
                }
            });
            net.getLinks().forEach(link -> {
                Long first = 1L; //findPoint(link.getFirst().getId(), ocPoints, ocPools, ocReservoirs);
                Long second = 1L; //findPoint(link.getSecond().getId(), ocPoints, ocPools, ocReservoirs);
                if (link instanceof Pump) {
                    ocPumps.add(pumpToOcPump((Pump) link, first, second));
                } else if (link instanceof Valve) {
                    ocValves.add(valveToOcValve((Valve) link, first, second));
                } else {
                    ocPipes.add(linkToOcPipe(link, first, second));
                }
            });
            NetworkDataInfo dataInfo = new NetworkDataInfo(ocPoints, ocReservoirs, ocPools, ocPipes, ocPumps, ocValves);
//            ocTimeMapper.insertSelective(time);
            log.info("END_RUN_OK");
            return dataInfo;
        } catch (Exception e) {
            log.info("END_RUN_ERR");
            e.printStackTrace();
        }
        return null;
    }

    public Long findPoint(String code, List<OcPoint> ocPoints, List<OcPool> ocPools, List<OcReservoir> ocReservoirs) {
        OcPoint ocPoint1 = ocPoints.stream()
                .filter(ocPoint -> ocPoint.getCode().equals(code))
                .findFirst()
                .orElse(null);
        if (ocPoint1 != null) return ocPoint1.getId();
        OcReservoir ocReservoir1 = ocReservoirs.stream()
                .filter(ocReservoir -> ocReservoir.getCode().equals(code))
                .findFirst()
                .orElse(null);
        if (ocReservoir1 != null) return ocReservoir1.getId();
        OcPool ocPool1 = ocPools.stream()
                .filter(ocPool -> ocPool.getCode().equals(code))
                .findFirst()
                .orElse(null);
        if (ocPool1 != null) return ocPool1.getId();
        return null;
    }

    public OcValve valveToOcValve(Valve valve, Long first, Long second) {
        OcValve ocValve = new OcValve();
        ocValve.setId(codeGenerate.newId());
        ocValve.setFlag(1);
        ocValve.setCreatorId(100L);
        ocValve.setModelId(1L);
        ocValve.setNetworkId(1L);
        ocValve.setCode(valve.getId());
        if (first != null) {
            ocValve.setStartNodeId(first);
            ocValve.setStartNodeCode(valve.getFirst().getId());
            ocValve.setStartLatitude(valve.getFirst().getPosition().getY());
            ocValve.setStartLongitude(valve.getFirst().getPosition().getX());
        }
        if (second != null) {
            ocValve.setEndNodeId(second);
            ocValve.setEndNodeCode(valve.getSecond().getId());
            ocValve.setStartLatitude(valve.getSecond().getPosition().getY());
            ocValve.setStartLongitude(valve.getSecond().getPosition().getX());
        }
        ocValve.setDescribeContent(valve.getComment());
        ocValve.setDiameter(valve.getDiameter());
        ocValve.setType(valve.getType().parseStr);
        ocValve.setSetting(valve.getRoughness());
        ocValve.setMinorLoss(valve.getKm());
        ocValve.setSteadyState(valve.getStat().parseStr);
        return ocValve;
    }

    public OcPump pumpToOcPump(Pump pump, Long first, Long second) {
        OcPump ocPump = new OcPump();
        ocPump.setId(codeGenerate.newId());
        ocPump.setFlag(1);
        ocPump.setCreatorId(100L);
        ocPump.setModelId(1L);
        ocPump.setNetworkId(1L);
        ocPump.setCode(pump.getId());
        if (first != null) {
            ocPump.setStartNodeId(first);
            ocPump.setStartNodeCode(pump.getFirst().getId());
            ocPump.setStartLatitude(pump.getFirst().getPosition().getY());
            ocPump.setStartLongitude(pump.getFirst().getPosition().getX());
        }
        if (second != null) {
            ocPump.setEndNodeId(second);
            ocPump.setEndNodeCode(pump.getSecond().getId());
            ocPump.setEndLatitude(pump.getSecond().getPosition().getY());
            ocPump.setEndLongitude(pump.getSecond().getPosition().getX());
        }
        ocPump.setDescribeContent(pump.getComment());
        ocPump.setCurveId(pump.getHcurve().getId());
        ocPump.setPower(pump.getKm());
        ocPump.setSpeedRatio(pump.getRoughness());
        ocPump.setInitStatus(pump.getStat().parseStr);
        Curve ecurve = pump.getEcurve();
        if (ecurve != null) {
            ocPump.setEfficiencyCurveId(ecurve.getId());
        }
        ocPump.setEnergyPrices(pump.getEcost());
        if (pump.getEpat() != null)
            ocPump.setPricesPatternId(pump.getEpat().getId());
        return ocPump;
    }

    public OcPipe linkToOcPipe(Link link, Long first, Long second) {
        OcPipe pipe = new OcPipe();
        pipe.setId(codeGenerate.newId());
        pipe.setFlag(1);
        pipe.setCreatorId(100L);
        pipe.setModelId(1L);
        pipe.setNetworkId(1L);
        pipe.setCode(link.getId());
        if (first != null) {
            pipe.setStartNodeId(first);
            pipe.setStartElev(link.getFirst().getElevation());
            pipe.setStartNodeCode(link.getFirst().getId());
            pipe.setStartLatitude(link.getFirst().getPosition().getY());
            pipe.setStartLongitude(link.getFirst().getPosition().getX());
        }
        if (second != null) {
            pipe.setEndNodeId(second);
            pipe.setEndElev(link.getSecond().getElevation());
            pipe.setEndNodeCode(link.getSecond().getId());
            pipe.setEndLatitude(link.getSecond().getPosition().getY());
            pipe.setEndLongitude(link.getSecond().getPosition().getX());
        }
        pipe.setDescribeContent(link.getComment());
        pipe.setLength(link.getLenght());
        pipe.setDiameter(link.getDiameter());
        pipe.setRoughness(link.getRoughness());
        pipe.setMinorLoss(link.getKm());
        pipe.setInitStatus(link.getStat().parseStr);
        pipe.setMainstream(link.getKb());
        pipe.setTubeWall(link.getKw());
        return pipe;
    }

    public OcPool tankToOcPool(Tank tank) {
        OcPool pool = new OcPool();
        pool.setId(codeGenerate.newId());
        pool.setFlag(1);
        pool.setCreatorId(100L);
        pool.setCode(tank.getId());
        pool.setModelId(1L);
        pool.setNetworkId(1L);
        pool.setPointX(tank.getPosition().getX());
        pool.setPointY(tank.getPosition().getY());
        pool.setLatitude(tank.getPosition().getY());
        pool.setLongitude(tank.getPosition().getX());
        pool.setElev(tank.getElevation());
        pool.setDescribeContent(tank.getComment());
        pool.setInitialQuality(tank.getC0()[0]);
        pool.setInitLevel(tank.getH0());
        pool.setMinLevel(tank.getHmin());
        pool.setMaxLevel(tank.getHmax());
        pool.setDiameter(tank.getArea());
        pool.setMinVol(tank.getVmin());
        if (tank.getVcurve() != null) {
            pool.setVolCurveId(tank.getVcurve().getId());
        }
        pool.setMixtureMode(tank.getMixModel().parseStr);
        pool.setMixtureRatio(tank.getV1max());
        pool.setReaction(tank.getKb());
        return pool;
    }

    public OcReservoir reservoirToOcReservoir(Reservoir tank) {
        OcReservoir reservoir = new OcReservoir();
        reservoir.setId(codeGenerate.newId());
        reservoir.setFlag(1);
        reservoir.setCreatorId(100L);
        reservoir.setCode(tank.getId());
        reservoir.setModelId(1L);
        reservoir.setNetworkId(1L);
        reservoir.setPointX(tank.getPosition().getX());
        reservoir.setPointY(tank.getPosition().getY());
        reservoir.setLatitude(tank.getPosition().getY());
        reservoir.setLongitude(tank.getPosition().getX());
        reservoir.setHead(tank.getElevation());
        reservoir.setDescribeContent(tank.getComment());
        reservoir.setInitialQuality(tank.getC0()[0]);
        return reservoir;
    }

    public OcPoint nodeToOcPoint(Node node) {
        OcPoint point = new OcPoint();
        point.setId(codeGenerate.newId());
        point.setFlag(1);
        point.setCreatorId(100L);
        point.setModelId(1L);
        point.setNetworkId(1L);
        point.setCode(node.getId());
        point.setPointX(node.getPosition().getX());
        point.setPointY(node.getPosition().getY());
        point.setLatitude(node.getPosition().getY());
        point.setLongitude(node.getPosition().getX());
        point.setElev(node.getElevation());
        point.setDescribeContent(node.getComment());
        point.setBasicDemand(node.getDemand().get(0).getBase());
        point.setTimePatternId(node.getDemand().get(0).getPattern().getId());
        point.setCoefficient(node.getKe());
        point.setInitialQuality(node.getC0()[0]);
        return point;
    }

}
