package com.example.demo.handler;

import com.example.demo.ObjectMapper;
import com.example.demo.model.*;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by GYH on 2021/8/26
 */
public class DataInputHandler {
    private final int pageSize = 500;

    private void inDiameter(List<OcPipe> ocPipes, List<OcPump> ocPumps, List<OcValve> ocValves, InpDataMap dataMap) {
        Map<String, Double> diameters = dataMap.diameters;
        ocPipes.forEach(p -> diameters.put(p.getCode(), p.getDiameter()));
        ocValves.forEach(p -> diameters.put(p.getCode(), p.getDiameter()));
        ocPumps.forEach(p -> diameters.put(p.getCode(), p.getDiameter()));
    }

    public void inReport(InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.report;
        bufferedWriter.write("[REPORT]").newLine()
                .write("Status").newTab()
                .write("FULL").newLine()
                .write("Summary").newTab()
                .write("YES").newLine()
                .write("NODES").newTab()
                .write("ALL").newLine()
                .write("LINKS").newTab()
                .write("ALL")
                .newLine()
                .newLine();
    }

    public void inCoordinates(InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.coordinateBuff;
        bufferedWriter.write("[COORDINATES]").newLine();
        if (!CollectionUtils.isEmpty(dataMap.nodeCoordinate)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("PointX").newTab()
                    .write("PointY").newLine();
            dataMap.nodeCoordinate.sort(Comparator.comparing(CodeNodeCoordinateResponse::getCode));
            for (CodeNodeCoordinateResponse coordinate : dataMap.nodeCoordinate) {
                bufferedWriter.write(coordinate.getCode()).newTab();
                bufferedWriter.writeDouble(coordinate.getLongitude()).newTab();
                bufferedWriter.writeDouble(coordinate.getLatitude()).newLine();
            }
        }
        bufferedWriter.newLine();
    }

    public void inStatus(InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.statusBuff;
        bufferedWriter.write("[STATUS]");
        bufferedWriter.newLine();
        if (!CollectionUtils.isEmpty(dataMap.statusList)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("InitStatus").newLine();
            dataMap.statusList.sort(Comparator.comparing(Status::getCode));

            for (Status s : dataMap.statusList) {
                bufferedWriter.write(s.getCode()).newTab();
                if (StringUtils.hasText(s.getInitStatus())) {
                    bufferedWriter.write(s.getInitStatus());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
    }

    public boolean inJunctions(List<OcPoint> ocPoints, InpDataMap dataMap) {
        List<CodeNodeCoordinateResponse> coordinatesList = ObjectMapper.clone(ocPoints, CodeNodeCoordinateResponse.class);
        StringBuilderWriter bufferedWriter = dataMap.junctions;
        bufferedWriter.write("[JUNCTIONS]").newLine();
        if (!CollectionUtils.isEmpty(ocPoints)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("Elev").newTab()
                    .write("Demand").newTab()
                    .write("Pattern").newLine();

            for (OcPoint junction : ocPoints) {
                bufferedWriter.write(junction.getCode()).newTab();
                bufferedWriter.writeDouble(junction.getElev()).newTab();
                if (!ObjectUtils.isEmpty(junction.getBasicDemand())) {
                    bufferedWriter.writeDouble(junction.getBasicDemand()).newTab();
                }
                if (StringUtils.hasText(junction.getTimePatternId())) {
                    bufferedWriter.write(junction.getTimePatternId()).newTab();
                }
                if (StringUtils.hasText(junction.getDescribeContent())) {
                    bufferedWriter.write(";").write(junction.getDescribeContent());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        dataMap.addAllNodeCoordinate(coordinatesList);
        return true;
    }

    public boolean inReservoirs(List<OcReservoir> ocReservoirs, InpDataMap dataMap) {
        List<CodeNodeCoordinateResponse> coordinatesList = ObjectMapper.clone(ocReservoirs, CodeNodeCoordinateResponse.class);
        StringBuilderWriter bufferedWriter = dataMap.reservoirs;
        bufferedWriter.write("[RESERVOIRS]").newLine();
        if (!CollectionUtils.isEmpty(ocReservoirs)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("Head").newTab()
                    .write("Pattern").newLine();

            for (OcReservoir reservoir : ocReservoirs) {
                bufferedWriter.write(reservoir.getCode()).newTab();
                bufferedWriter.writeDouble(reservoir.getHead()).newTab();
                if (StringUtils.hasText(reservoir.getTimePatternId())) {
                    bufferedWriter.write(reservoir.getTimePatternId()).newTab();
                }
                if (!ObjectUtils.isEmpty(reservoir.getDescribeContent())) {
                    bufferedWriter.write(";").write(reservoir.getDescribeContent());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        dataMap.addAllNodeCoordinate(coordinatesList);
        return true;
    }

    public boolean inTanks(List<OcPool> ocPools, InpDataMap dataMap) {
        List<CodeNodeCoordinateResponse> coordinatesList = ObjectMapper.clone(ocPools, CodeNodeCoordinateResponse.class);
        StringBuilderWriter bufferedWriter = dataMap.tanks;
        bufferedWriter.write("[TANKS]").newLine();
        if (!CollectionUtils.isEmpty(ocPools)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("Elev").newTab()
                    .write("InitLevel").newTab()
                    .write("MinLevel").newTab()
                    .write("MaxLevel").newTab()
                    .write("Diameter").newTab()
                    .write("MinVol").newTab()
                    .write("VolCurveId").newLine();

            for (OcPool tank : ocPools) {
                bufferedWriter.write(tank.getCode()).newTab();
                bufferedWriter.writeDouble(tank.getElev()).newTab();
                bufferedWriter.writeDouble(tank.getInitLevel()).newTab();
                bufferedWriter.writeDouble(tank.getMinLevel()).newTab();
                bufferedWriter.writeDouble(tank.getMaxLevel()).newTab();
                bufferedWriter.writeDouble(tank.getDiameter()).newTab();
                bufferedWriter.writeDouble(tank.getMinVol()).newTab();
                if (StringUtils.hasText(tank.getVolCurveId())) {
                    bufferedWriter.write(tank.getVolCurveId()).newTab();
                }
                if (StringUtils.hasText(tank.getDescribeContent())) {
                    bufferedWriter.write(";").write(tank.getDescribeContent());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();

        StringBuilderWriter mixingBuffer = dataMap.mixing;
        mixingBuffer.write("[MIXING]").newLine();
        if (!CollectionUtils.isEmpty(ocPools)) {
            mixingBuffer.write(";")
                    .write("Code").newTab()
                    .write("MixtureMode").newTab()
                    .write("MixtureRatio").newLine();

            for (OcPool mixing : ocPools) {
                mixingBuffer.write(mixing.getCode()).newTab();
                mixingBuffer.write(mixing.getMixtureMode(), "MIXED").newTab();
                mixingBuffer.writeDouble(mixing.getMixtureRatio());
                mixingBuffer.newLine();
            }
        }
        mixingBuffer.newLine();
        dataMap.addAllNodeCoordinate(coordinatesList);
        return true;
    }

    public boolean inPipes(List<OcPipe> ocPipes, InpDataMap dataMap) {
        ocPipes.forEach(value -> {
            if (value.getInitStatus() == null) value.setInitStatus("OPEN");
        });
        List<Status> pipesStatusList = ObjectMapper.clone(ocPipes, Status.class);
        dataMap.statusList.addAll(pipesStatusList);
        StringBuilderWriter bufferedWriter = dataMap.pipes;
        bufferedWriter.write("[PIPES]").newLine();
        if (!CollectionUtils.isEmpty(ocPipes)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("StartNodeCode").newTab()
                    .write("EndNodeCode").newTab()
                    .write("Length").newTab()
                    .write("Diameter").newTab()
                    .write("Roughness").newTab()
                    .write("MinorLoss").newTab()
                    .write("InitStatus").newLine();

            for (OcPipe pipe : ocPipes) {
                bufferedWriter.write(pipe.getCode()).newTab();
                if (StringUtils.hasText(pipe.getStartNodeCode())) {
                    bufferedWriter.write(pipe.getStartNodeCode()).newTab();
                }
                if (StringUtils.hasText(pipe.getEndNodeCode())) {
                    bufferedWriter.write(pipe.getEndNodeCode()).newTab();
                }
                bufferedWriter.writeDouble(pipe.getLength()).newTab();
                if (!ObjectUtils.isEmpty(pipe.getDiameter())) {
                    if (pipe.getDiameter() == 0) bufferedWriter.write("0.1").newTab();
                    else bufferedWriter.writeDouble(pipe.getDiameter()).newTab();
                } else bufferedWriter.writeDouble(0.1).newTab();
                if (!ObjectUtils.isEmpty(pipe.getRoughness())) {
                    if (pipe.getRoughness() == 0) {
                        bufferedWriter.write("0.1").newTab();
                    } else {
                        bufferedWriter.writeDouble(pipe.getRoughness()).newTab();
                    }
                } else bufferedWriter.writeDouble(0.1).newTab();
                bufferedWriter.writeDouble(pipe.getMinorLoss()).newTab();
                if (ObjectUtils.isEmpty(pipe.getInitStatus())) {
                    bufferedWriter.write(pipe.getInitStatus());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        dataMap.addAllLinkCoordinate(ObjectMapper.clone(ocPipes, CodeLinkCoordinateResponse.class));
        return true;
    }

    public boolean inPumps(List<OcPump> ocPumps, InpDataMap dataMap) {
        ocPumps.forEach(value -> {
            if (value.getInitStatus() == null) value.setInitStatus("OPEN");
        });
        List<Status> pumpsStatusList = ObjectMapper.clone(ocPumps, Status.class);
        dataMap.statusList.addAll(pumpsStatusList);
        StringBuilderWriter bufferedWriter = dataMap.pumps;
        bufferedWriter.write("[PUMPS]").newLine();
        if (!CollectionUtils.isEmpty(ocPumps)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("StartNodeCode").newTab()
                    .write("EndNodeCode").newTab()
                    .write("Pattern").newLine();

            for (OcPump pump : ocPumps) {
                bufferedWriter.write(pump.getCode()).newTab();
                if (!ObjectUtils.isEmpty(pump.getStartNodeCode())) {
                    bufferedWriter.write(String.valueOf(pump.getStartNodeCode())).newTab();
                }
                if (!ObjectUtils.isEmpty(pump.getEndNodeCode())) {
                    bufferedWriter.write(String.valueOf(pump.getEndNodeCode())).newTab();
                }
                if (StringUtils.hasText(pump.getCurveId())) {
                    bufferedWriter.write("HEAD ").write(pump.getCurveId());
                }
                if (pump.getPower() != null && pump.getPower() != 0) {
                    bufferedWriter.write("  POWER ").writeDouble(pump.getPower());
                }
                if (pump.getSpeedRatio() != null && pump.getSpeedRatio() != 0) {
                    bufferedWriter.write("  SPEED ").writeDouble(pump.getSpeedRatio());
                }
                if (StringUtils.hasText(pump.getTimePatternId())) {
                    bufferedWriter.write("  PATTERN ").write(pump.getTimePatternId());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        dataMap.addAllLinkCoordinate(ObjectMapper.clone(ocPumps, CodeLinkCoordinateResponse.class));
        return true;
    }

    public boolean inValves(List<OcValve> ocValves, InpDataMap dataMap) {
        ocValves.forEach(it -> {
            Status status = new Status();
            status.setCode(it.getCode());
            status.setInitStatus(it.getSteadyState());
            status.setSchemeId(it.getModelId());
            dataMap.statusList.add(status);
        });
        StringBuilderWriter bufferedWriter = dataMap.valves;
        bufferedWriter.write("[VALVES]").newLine();
        if (!CollectionUtils.isEmpty(ocValves)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("Node1").newTab()
                    .write("Node2").newTab()
                    .write("Diameter").newTab()
                    .write("Type").newTab()
                    .write("Setting").newTab()
                    .write("MinorLoss").newLine();

            for (OcValve valve : ocValves) {
                bufferedWriter.write(valve.getCode()).newTab();
                if (!ObjectUtils.isEmpty(valve.getStartNodeCode())) {
                    bufferedWriter.write(valve.getStartNodeCode()).newTab();
                }
                if (!ObjectUtils.isEmpty(valve.getEndNodeCode())) {
                    bufferedWriter.write(valve.getEndNodeCode()).newTab();
                }
                bufferedWriter.writeDouble(valve.getDiameter()).newTab();
                if (!ObjectUtils.isEmpty(valve.getType())) {
                    bufferedWriter.write(valve.getType()).newTab();
                }
                bufferedWriter.writeDouble(valve.getSetting()).newTab();
                bufferedWriter.writeDouble(valve.getMinorLoss()).newTab();
                if (StringUtils.hasText(valve.getDescribeContent())) {
                    bufferedWriter.write(";").write(valve.getDescribeContent());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        dataMap.addAllLinkCoordinate(ObjectMapper.clone(ocValves, CodeLinkCoordinateResponse.class));
        return true;
    }

    public boolean inCurves(List<OcCurve> ocCurves, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.curves;
        bufferedWriter.write("[CURVES]").newLine();
        if (!CollectionUtils.isEmpty(ocCurves)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("XValue").newTab()
                    .write("YValue").newLine();

            for (OcCurve it : ocCurves) {
                bufferedWriter.write(it.getCode()).newTab();
                bufferedWriter.writeDouble(it.getxValue()).newTab();
                bufferedWriter.writeDouble(it.getyValue());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inDemands(List<OcPoint> ocPoints, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.demands;
        bufferedWriter.write("[DEMANDS]").newLine();
        if (!CollectionUtils.isEmpty(ocPoints)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("BasicDemand").newTab()
                    .write("TimePatternId").newLine();

            for (OcPoint demand : ocPoints) {
                bufferedWriter.write(demand.getCode()).newTab();
                bufferedWriter.writeDouble(demand.getBasicDemand()).newTab();
                if (StringUtils.hasText(demand.getTimePatternId())) {
                    bufferedWriter.write(demand.getTimePatternId());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inControls(OcScheme ocScheme, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.rulesControls;
        bufferedWriter.write("[CONTROLS]").newLine();
        if (ocScheme.getSimpleControl() != null)
            bufferedWriter.write(ocScheme.getSimpleControl()).newLine();
        bufferedWriter.write("[RULES]").newLine();
        if (ocScheme.getRuleControl() != null)
            bufferedWriter.write(ocScheme.getRuleControl()).newLine();
        return true;
    }

    public boolean inPatterns(List<OcPattern> ocPatterns, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.patterns;
        bufferedWriter.write("[PATTERNS]").newLine();
        if (!CollectionUtils.isEmpty(ocPatterns)) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("Multipliers").newLine();

            for (OcPattern pattern : ocPatterns) {
                if (StringUtils.hasText(pattern.getMultipliers())) {
                    int num = 0;
                    bufferedWriter.newLine();
                    String code = pattern.getCode();
                    String multipliers = pattern.getMultipliers();
                    String[] split = multipliers.split(" ");
                    for (String s : split) {
                        if (num == 0) {
                            bufferedWriter.write(code).newTab();
                        }
                        bufferedWriter.write(s).newTab();
                        num++;
                        if (num > 5) {
                            bufferedWriter.newLine();
                            num = 0;
                        }
                    }
                }
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inQualityPoint(List<OcPoint> ocPoints, InpDataMap dataMap) {
        HashMap<String, Double> collect = ocPoints.stream().collect(HashMap::new, (h, c) -> h.put(c.getCode(), c.getInitialQuality()), HashMap::putAll);
        return inQuality(collect, dataMap);
    }

    public boolean inQualityPool(List<OcPool> ocPools, InpDataMap dataMap) {
        HashMap<String, Double> collect = ocPools.stream().collect(HashMap::new, (h, c) -> h.put(c.getCode(), c.getInitialQuality()), HashMap::putAll);
        return inQuality(collect, dataMap);
    }

    public boolean inQualityReservoir(List<OcReservoir> ocReservoirs, InpDataMap dataMap) {
        HashMap<String, Double> collect = ocReservoirs.stream().collect(HashMap::new, (h, c) -> h.put(c.getCode(), c.getInitialQuality()), HashMap::putAll);
        return inQuality(collect, dataMap);
    }

    public boolean inQuality(HashMap<String, Double> collect, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.quality;
        bufferedWriter.write("[QUALITY]").newLine();
        Double d = 0.0;
        if (collect.size() > 0) {
            bufferedWriter.write(";")
                    .write("Code").newTab()
                    .write("InitialQuality").newLine();

            collect.forEach((k, v) -> {
                if (v != null && !v.equals(d)) {
                    bufferedWriter.write(k).newTab()
                            .writeDouble(v)
                            .newLine();
                }
            });
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inSource(List<OcSource> ocSources, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.source;
        bufferedWriter.write("[SOURCES]").newLine();
        if (!CollectionUtils.isEmpty(ocSources)) {
            bufferedWriter.write(";")
                    .write("NodeCode").newTab()
                    .write("Type").newTab()
                    .write("Strength").newTab()
                    .write("TimePatternId").newLine();

            for (OcSource sources : ocSources) {
                bufferedWriter.write(sources.getNodeCode()).newTab();
                bufferedWriter.write(sources.getType(), "CONCEN").newTab();
                bufferedWriter.writeDouble(sources.getStrength()).newTab();
                if (StringUtils.hasText(sources.getTimePatternId())) {
                    bufferedWriter.write(sources.getTimePatternId());
                }
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inTimes(List<OcTime> ocTimes, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.times;
        bufferedWriter.write("[TIMES]").newLine();
        if (!CollectionUtils.isEmpty(ocTimes)) {
            for (OcTime time : ocTimes) {
                bufferedWriter.write("DURATION").newTab()
                        .write(time.getDuration(), "1:00").newLine()
                        .write("HYDRAULIC   TIMESTEP").newTab()
                        .write(time.getHydraulicTimestep(), "1:00").newLine()
                        .write("QUALITY   TIMESTEP").newTab()
                        .write(time.getQualityTimestep(), "0:05").newLine()
                        .write("PATTERN   TIMESTEP").newTab()
                        .write(time.getPatternTimestep(), "1:00").newLine()
                        .write("PATTERN   START").newTab()
                        .write(time.getPatternStart(), "0").newLine()
                        .write("REPORT   TIMESTEP").newTab()
                        .write(time.getReportTimestep(), "1:00").newLine()
                        .write("REPORT   START").newTab()
                        .write(time.getReportStart(), "0").newLine()
                        .write("START   CLOCKTIME").newTab()
                        .write(time.getStartClocktime(), "12:00 AM").newLine()
                        .write("STATISTIC").newTab()
                        .write(time.getStatistics(), "NONE")
                        .newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inOptions(Long schemeId, InpDataMap dataMap) {
        /*OcQuality ocQuality = new OcQuality();
        ocQuality.setSchemeId(schemeId);
        OcQuality quality = ocQualityService.selectOne(ocQuality).getData();
        if (quality == null) quality = new OcQuality();
        OcScheme ocScheme = ocSchemeService.selectByPrimaryKey(schemeId).getData();
        if (ocScheme == null) ocScheme = new OcScheme();
        StringBuilderWriter bufferedWriter = dataMap.options;
        // TODO 字段不全 HYDRAULICS,MAP,
        bufferedWriter.write("[OPTIONS]").newLine()
                .write("UNITS").newTab()
                .write(ocScheme.getFluxUnit(), "GPM").newLine()
                .write("HEADLOSS").newTab()
                .write(ocScheme.getLoss(), "H-W").newLine()
                .write("QUALITY").newTab()
                .write(quality.getType(), "NONE").newTab();
        if ("TRACE".equals(quality.getType())) {
            bufferedWriter.write(quality.getNode());
        } else {
            bufferedWriter.write(quality.getUnit());
        }
        bufferedWriter.write(quality.getUnit()).newLine()
                .write("VISCOSITY").newTab();
        if (!ObjectUtils.isEmpty(ocScheme.getViscosity())) {
            bufferedWriter.write(ocScheme.getViscosity()).newLine();
        } else bufferedWriter.writeDouble(1.0).newLine();
        if (!ObjectUtils.isEmpty(quality.getDiffusivity())) {
            bufferedWriter.write("DIFFUSIVITY").newTab();
            bufferedWriter.write(quality.getDiffusivity()).newLine();
        }
        if (!ObjectUtils.isEmpty(ocScheme.getProportion())) {
            bufferedWriter.write("SPECIFIC GRAVITY").newTab();
            bufferedWriter.write(ocScheme.getProportion()).newLine();
        }
        bufferedWriter.write("TRIALS").newTab();
        if (!ObjectUtils.isEmpty(ocScheme.getCalculate())) {
            bufferedWriter.write(ocScheme.getCalculate()).newLine();
        } else bufferedWriter.write(40).newLine();
        bufferedWriter.write("ACCURACY").newTab();
        if (!ObjectUtils.isEmpty(ocScheme.getAccuracy())) {
            bufferedWriter.write(ocScheme.getAccuracy()).newLine();
        } else bufferedWriter.writeDouble(0.001).newLine();
        bufferedWriter.write("UNBALANCED").newTab()
                .write(ocScheme.getBalance(), "STOP").newLine()
                .write("PATTERN").newTab()
                .write(ocScheme.getDefaultModeId(), "1").newLine()
                .write("DEMAND MULTIPLIER").newTab();
        if (!ObjectUtils.isEmpty(ocScheme.getDemandRate())) {
            bufferedWriter.write(ocScheme.getDemandRate()).newLine();
        } else bufferedWriter.write("1.0").newLine();
        bufferedWriter.write("EMITTER EXPONENT").newTab();
        if (!ObjectUtils.isEmpty(ocScheme.getExponent())) {
            bufferedWriter.write(ocScheme.getExponent()).newLine();
        } else bufferedWriter.write("0.5").newLine();
        bufferedWriter.write("TOLERANCE").newTab();
        if (!ObjectUtils.isEmpty(quality.getTolerance())) {
            bufferedWriter.write(quality.getTolerance()).newLine();
        } else bufferedWriter.write("0.01").newLine();

        bufferedWriter.newLine();*/
        return true;
    }

    public boolean inEnergy(OcEnergy data, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.energy;
        bufferedWriter.write("[ENERGY]").newLine();
        if (data != null) {
            if (!ObjectUtils.isEmpty(data.getEffic())) {
                bufferedWriter.write("Global Efficiency").newTab()
                        .write(data.getEffic().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getPrice())) {
                bufferedWriter.write("Global Price").newTab()
                        .write(data.getPrice().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getDemandCharge())) {
                bufferedWriter.write("Demand Charge").newTab()
                        .write(data.getDemandCharge().toString()).newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

    public boolean inReactions(OcReact data, InpDataMap dataMap) {
        StringBuilderWriter bufferedWriter = dataMap.reactions;
        bufferedWriter.write("[REACTIONS]").newLine();
        if (data != null) {
            if (!ObjectUtils.isEmpty(data.getBulk())) {
                bufferedWriter.write("Order Bulk").newTab()
                .write(data.getBulk().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getTank())) {
                bufferedWriter.write("Order Tank").newTab()
                .write(data.getTank().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getWall())) {
                bufferedWriter.write("Order Wall").newTab()
                .write(data.getWall().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getGlobalBulk())) {
                bufferedWriter.write("Global Bulk").newTab()
                .write(data.getGlobalBulk().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getGlobalWall())) {
                bufferedWriter.write("Global Wall").newTab()
                .write(data.getGlobalWall().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getLimiting())) {
                bufferedWriter.write("Limiting Potential").newTab()
                .write(data.getLimiting().toString()).newLine();
            }
            if (!ObjectUtils.isEmpty(data.getCorrelation())) {
                bufferedWriter.write("Roughness Correlation").newTab()
                .write(data.getCorrelation()).newLine();
            }
        }
        bufferedWriter.newLine();
        return true;
    }

}
