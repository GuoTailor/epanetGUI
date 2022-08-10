package com.example.demo.simplify;

import com.example.demo.model.*;

import java.util.LinkedList;

/**
 * Created by GYH on 2021/9/13
 */
public class SimpleLink {
    public String code;
    public int state = 0;
    public String startCode;
    public String endCode;
    public Object target;
    public LinkedList<SimpleNode> nodes = new LinkedList<>();

    public SimpleLink(OcPipe pipe) {
        this.target = pipe;
        code = pipe.getCode();
        startCode = pipe.getStartNodeCode();
        endCode = pipe.getEndNodeCode();
    }

    public SimpleLink(OcPump pump) {
        target = pump;
        code = pump.getCode();
        startCode = pump.getStartNodeCode();
        endCode = pump.getEndNodeCode();
    }

    public SimpleLink(OcValve valve) {
        target = valve;
        code = valve.getCode();
        startCode = valve.getStartNodeCode();
        endCode = valve.getEndNodeCode();
    }
}
