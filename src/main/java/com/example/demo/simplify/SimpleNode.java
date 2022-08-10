package com.example.demo.simplify;

import com.example.demo.model.*;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by GYH on 2021/9/13
 */
public class SimpleNode {
    public String code;
    public Object target;
    public int state = 0;
    public LinkedList<SimpleLink> links = new LinkedList<>();
    public LinkedList<SimpleNode> path = new LinkedList<>();

    public SimpleNode(OcPool pool) {
        code = pool.getCode();
        this.target = pool;
    }

    public SimpleNode(OcReservoir reservoir) {
        this.target = reservoir;
        code = reservoir.getCode();
    }

    public SimpleNode(OcPoint point) {
        this.target = point;
        code = point.getCode();
    }

    public Long getId() {
        if (target instanceof OcPoint) return ((OcPoint) target).getId();
        if (target instanceof OcPool) return ((OcPool) target).getId();
        if (target instanceof OcReservoir) return ((OcReservoir) target).getId();
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleNode that = (SimpleNode) o;
        return Objects.equals(code, that.code) && Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, target);
    }
}
