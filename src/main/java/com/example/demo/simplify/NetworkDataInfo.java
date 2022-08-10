package com.example.demo.simplify;


import com.example.demo.model.*;

import java.util.List;

/**
 * Created by GYH on 2021/9/12
 */
public class NetworkDataInfo {
    public List<OcPoint> points;
    public List<OcReservoir> reservoirs;
    public List<OcPool> pools;
    public List<OcPipe> pipes;
    public List<OcPump> pumps;
    public List<OcValve> valves;

    public NetworkDataInfo(List<OcPoint> points, List<OcReservoir> reservoirs, List<OcPool> pools, List<OcPipe> pipes, List<OcPump> pumps, List<OcValve> valves) {
        this.points = points;
        this.reservoirs = reservoirs;
        this.pools = pools;
        this.pipes = pipes;
        this.pumps = pumps;
        this.valves = valves;
    }
}
