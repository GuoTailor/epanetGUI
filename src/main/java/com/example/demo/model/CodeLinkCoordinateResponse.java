package com.example.demo.model;

import java.util.Objects;

/**
 * Created by GYH on 2021/6/24
 */
public class CodeLinkCoordinateResponse implements CodeCoordinateResponse {

    private String code;

    /**
     * 开始节点经度
     */
    private Double startLongitude;

    /**
     * 开始节点纬度
     */
    private Double startLatitude;

    /**
     * 结束节点经度
     */
    private Double endLongitude;

    /**
     * 结束节点纬度
     */
    private Double endLatitude;

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodeLinkCoordinateResponse)) return false;
        CodeLinkCoordinateResponse that = (CodeLinkCoordinateResponse) o;
        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }
}
