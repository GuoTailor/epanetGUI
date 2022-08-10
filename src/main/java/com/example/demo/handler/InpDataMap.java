package com.example.demo.handler;


import com.example.demo.model.CodeLinkCoordinateResponse;
import com.example.demo.model.CodeNodeCoordinateResponse;
import com.example.demo.model.Status;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by GYH on 2021/8/27
 */
public class InpDataMap {
    /*** 点坐标集合*/
    public List<CodeNodeCoordinateResponse> nodeCoordinate = new LinkedList<>();

    public List<CodeLinkCoordinateResponse> linkCoordinate = new LinkedList<>();

    /*** 状态集合*/
    public List<Status> statusList = new LinkedList<>();

    public Map<String, Double> diameters = new HashMap<>();

    /*** 坐标*/
    public StringBuilderWriter coordinateBuff = new StringBuilderWriter();

    /*** 状态 */
    public StringBuilderWriter statusBuff = new StringBuilderWriter();

    /*** 报告 */
    public StringBuilderWriter report = new StringBuilderWriter();

    /*** 节点*/
    public StringBuilderWriter junctions = new StringBuilderWriter();

    /*** 水库*/
    public StringBuilderWriter reservoirs = new StringBuilderWriter();

    /*** 水池*/
    public StringBuilderWriter tanks = new StringBuilderWriter();

    /*** 管道*/
    public StringBuilderWriter pipes = new StringBuilderWriter();

    /*** 水泵*/
    public StringBuilderWriter pumps = new StringBuilderWriter();

    /*** 阀门*/
    public StringBuilderWriter valves = new StringBuilderWriter();

    public StringBuilderWriter mixing = new StringBuilderWriter();

    /*** 规则控制*/
    public StringBuilderWriter rulesControls = new StringBuilderWriter();

    /*** 曲线*/
    public StringBuilderWriter curves = new StringBuilderWriter();

    /*** demands*/
    public StringBuilderWriter demands = new StringBuilderWriter();

    /*** 时间模式*/
    public StringBuilderWriter patterns = new StringBuilderWriter();

    /*** 水质*/
    public StringBuilderWriter quality = new StringBuilderWriter();

    /*** source*/
    public StringBuilderWriter source = new StringBuilderWriter();

    /*** times*/
    public StringBuilderWriter times = new StringBuilderWriter();

    /*** options*/
    public StringBuilderWriter options = new StringBuilderWriter();

    /*** energy*/
    public StringBuilderWriter energy = new StringBuilderWriter();

    /*** reactions*/
    public StringBuilderWriter reactions = new StringBuilderWriter();

    /**
     * 追加点坐标
     *
     * @param coordinatesList 点坐标集合
     * @return {@code InpDataMap}
     */
    public InpDataMap addAllNodeCoordinate(List<CodeNodeCoordinateResponse> coordinatesList) {
        if (!CollectionUtils.isEmpty(coordinatesList)) {
            coordinatesList.forEach(value -> {
                if (value.getLatitude() == null) {
                    value.setLatitude(0.0);
                }
                if (value.getLongitude() == null) {
                    value.setLongitude(0.0);
                }
            });
            nodeCoordinate.addAll(coordinatesList);
        }
        return this;
    }

    /**
     * 追加线坐标
     *
     * @param linkCoordinate 线坐标集合
     * @return {@code InpDataMap}
     */
    public InpDataMap addAllLinkCoordinate(List<CodeLinkCoordinateResponse> linkCoordinate) {
        if (!CollectionUtils.isEmpty(linkCoordinate)) {
            linkCoordinate.forEach(value -> {
                if (value.getStartLatitude() == null) {
                    value.setStartLatitude(0.0);
                }
                if (value.getStartLongitude() == null) {
                    value.setStartLongitude(0.0);
                }
                if (value.getEndLatitude() == null) {
                    value.setEndLatitude(0.0);
                }
                if (value.getEndLongitude() == null) {
                    value.setEndLongitude(0.0);
                }
            });
            this.linkCoordinate.addAll(linkCoordinate);
        }
        return this;
    }

    public void cleanStringBuild() {
        junctions.clean();
        reservoirs.clean();
        tanks.clean();
        pipes.clean();
        pumps.clean();
        pumps.clean();
        mixing.clean();
        patterns.clean();
        curves.clean();
        quality.clean();
        options.clean();
        valves.clean();
        rulesControls.clean();
        coordinateBuff.clean();
        demands.clean();
        source.clean();
        statusBuff.clean();
        times.clean();
        reactions.clean();
        energy.clean();
    }
}
