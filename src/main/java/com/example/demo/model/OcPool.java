package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcPool implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 管网id
     */
    private Long networkId;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 位置
     */
    private String location;

    /**
     * epanet id
     */
    private String code;

    /**
     * x坐标
     */
    private Double pointX;

    /**
     * y坐标
     */
    private Double pointY;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 水池名
     */
    private String name;

    /**
     * 描述
     */
    private String describeContent;

    /**
     * 标签
     */
    private String label;

    /**
     * 标高(米)
     */
    private Double elev;

    /**
     * 初始水位
     */
    private Double initLevel;

    /**
     * 最低水位
     */
    private Double minLevel;

    /**
     * 最高水位
     */
    private Double maxLevel;

    /**
     * 直径
     */
    private Double diameter;

    /**
     * 最小容积
     */
    private Double minVol;

    /**
     * 容积曲线id
     */
    private String volCurveId;

    /**
     * 混合模型
     * MIXED（完全混合）
     * 2COMP（双室混合）
     * FIFO（先进先出柱塞流）
     * LIFO（后进先出柱塞流）
     */
    private String mixtureMode;

    /**
     * 水池总容积的分数
     */
    private Double mixtureRatio;

    /**
     * 反应系数
     */
    private Double reaction;

    /**
     * 初始水质
     */
    private Double initialQuality;

    /**
     * 源头水质id
     */
    private Long sourceQuality;

    /**
     * 状态：0-停用，1-启用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 字段创建者ID
     */
    private Long creatorId;

    /**
     * 字段创建时间
     */
    private Date createTime;

    /**
     * 字段更新者ID
     */
    private Long updatorId;

    /**
     * 字段更新时间
     */
    private Date updateTime;

    /**
     * 标志：0-已删除、1-未删除
     */
    private Integer flag;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取方案id
     *
     * @return scheme_id - 方案id
     */
    public Long getModelId() {
        return modelId;
    }

    /**
     * 设置方案id
     *
     * @param modelId 方案id
     */
    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getNetworkId() {
        return networkId;
    }

    public void setNetworkId(Long networkId) {
        this.networkId = networkId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    /**
     * 获取epanet id
     *
     * @return code - epanet id
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置epanet id
     *
     * @param code epanet id
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取x坐标
     *
     * @return point_x - x坐标
     */
    public Double getPointX() {
        return pointX;
    }

    /**
     * 设置x坐标
     *
     * @param pointX x坐标
     */
    public void setPointX(Double pointX) {
        this.pointX = pointX;
    }

    /**
     * 获取y坐标
     *
     * @return point_y - y坐标
     */
    public Double getPointY() {
        return pointY;
    }

    /**
     * 设置y坐标
     *
     * @param pointY y坐标
     */
    public void setPointY(Double pointY) {
        this.pointY = pointY;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取水池名
     *
     * @return name - 水池名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置水池名
     *
     * @param name 水池名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return describe_content - 描述
     */
    public String getDescribeContent() {
        return describeContent;
    }

    /**
     * 设置描述
     *
     * @param describeContent 描述
     */
    public void setDescribeContent(String describeContent) {
        this.describeContent = describeContent;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取标高(米)
     *
     * @return elev - 标高(米)
     */
    public Double getElev() {
        return elev;
    }

    /**
     * 设置标高(米)
     *
     * @param elev 标高(米)
     */
    public void setElev(Double elev) {
        this.elev = elev;
    }

    /**
     * 获取初始水位
     *
     * @return init_level - 初始水位
     */
    public Double getInitLevel() {
        return initLevel;
    }

    /**
     * 设置初始水位
     *
     * @param initLevel 初始水位
     */
    public void setInitLevel(Double initLevel) {
        this.initLevel = initLevel;
    }

    /**
     * 获取最低水位
     *
     * @return min_level - 最低水位
     */
    public Double getMinLevel() {
        return minLevel;
    }

    /**
     * 设置最低水位
     *
     * @param minLevel 最低水位
     */
    public void setMinLevel(Double minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * 获取最高水位
     *
     * @return max_level - 最高水位
     */
    public Double getMaxLevel() {
        return maxLevel;
    }

    /**
     * 设置最高水位
     *
     * @param maxLevel 最高水位
     */
    public void setMaxLevel(Double maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * 获取直径
     *
     * @return diameter - 直径
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * 设置直径
     *
     * @param diameter 直径
     */
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * 获取最小容积
     *
     * @return min_vol - 最小容积
     */
    public Double getMinVol() {
        return minVol;
    }

    /**
     * 设置最小容积
     *
     * @param minVol 最小容积
     */
    public void setMinVol(Double minVol) {
        this.minVol = minVol;
    }

    /**
     * 获取容积曲线id
     *
     * @return vol_curve_id - 容积曲线id
     */
    public String getVolCurveId() {
        return volCurveId;
    }

    /**
     * 设置容积曲线id
     *
     * @param volCurveId 容积曲线id
     */
    public void setVolCurveId(String volCurveId) {
        this.volCurveId = volCurveId;
    }

    /**
     * 获取混合模型
     * MIXED（完全混合）
     * 2COMP（双室混合）
     * FIFO（先进先出柱塞流）
     * LIFO（后进先出柱塞流）
     *
     * @return mixture_mode - 混合模型
     */
    public String getMixtureMode() {
        return mixtureMode;
    }

    /**
     * 设置混合模型
     * MIXED（完全混合）
     * 2COMP（双室混合）
     * FIFO（先进先出柱塞流）
     * LIFO（后进先出柱塞流）
     *
     * @param mixtureMode 混合模型
     */
    public void setMixtureMode(String mixtureMode) {
        this.mixtureMode = mixtureMode;
    }

    /**
     * 获取水池总容积的分数
     *
     * @return mixture_ratio - 水池总容积的分数
     */
    public Double getMixtureRatio() {
        return mixtureRatio;
    }

    /**
     * 设置水池总容积的分数
     *
     * @param mixtureRatio 水池总容积的分数
     */
    public void setMixtureRatio(Double mixtureRatio) {
        this.mixtureRatio = mixtureRatio;
    }

    /**
     * 获取反应系数
     *
     * @return reaction - 反应系数
     */
    public Double getReaction() {
        return reaction;
    }

    /**
     * 设置反应系数
     *
     * @param reaction 反应系数
     */
    public void setReaction(Double reaction) {
        this.reaction = reaction;
    }

    /**
     * 获取初始水质
     *
     * @return initial_quality - 初始水质
     */
    public Double getInitialQuality() {
        return initialQuality;
    }

    /**
     * 设置初始水质
     *
     * @param initialQuality 初始水质
     */
    public void setInitialQuality(Double initialQuality) {
        this.initialQuality = initialQuality;
    }

    /**
     * 获取源头水质id
     *
     * @return source_quality - 源头水质id
     */
    public Long getSourceQuality() {
        return sourceQuality;
    }

    /**
     * 设置源头水质id
     *
     * @param sourceQuality 源头水质id
     */
    public void setSourceQuality(Long sourceQuality) {
        this.sourceQuality = sourceQuality;
    }

    /**
     * 获取状态：0-停用，1-启用
     *
     * @return status - 状态：0-停用，1-启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：0-停用，1-启用
     *
     * @param status 状态：0-停用，1-启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取字段创建者ID
     *
     * @return creator_id - 字段创建者ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置字段创建者ID
     *
     * @param creatorId 字段创建者ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取字段创建时间
     *
     * @return create_time - 字段创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段创建时间
     *
     * @param createTime 字段创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取字段更新者ID
     *
     * @return updator_id - 字段更新者ID
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * 设置字段更新者ID
     *
     * @param updatorId 字段更新者ID
     */
    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    /**
     * 获取字段更新时间
     *
     * @return update_time - 字段更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置字段更新时间
     *
     * @param updateTime 字段更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取标志：0-已删除、1-未删除
     *
     * @return flag - 标志：0-已删除、1-未删除
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置标志：0-已删除、1-未删除
     *
     * @param flag 标志：0-已删除、1-未删除
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "OcPool{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", networkId=" + networkId +
                ", schemeId=" + schemeId +
                ", location='" + location + '\'' +
                ", code='" + code + '\'' +
                ", pointX=" + pointX +
                ", pointY=" + pointY +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", name='" + name + '\'' +
                ", describeContent='" + describeContent + '\'' +
                ", label='" + label + '\'' +
                ", elev=" + elev +
                ", initLevel=" + initLevel +
                ", minLevel=" + minLevel +
                ", maxLevel=" + maxLevel +
                ", diameter=" + diameter +
                ", minVol=" + minVol +
                ", volCurveId='" + volCurveId + '\'' +
                ", mixtureMode='" + mixtureMode + '\'' +
                ", mixtureRatio=" + mixtureRatio +
                ", reaction=" + reaction +
                ", initialQuality=" + initialQuality +
                ", sourceQuality=" + sourceQuality +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", creatorId=" + creatorId +
                ", createTime=" + createTime +
                ", updatorId=" + updatorId +
                ", updateTime=" + updateTime +
                ", flag=" + flag +
                '}';
    }
}