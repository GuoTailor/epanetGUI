package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcPump implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * epanet id
     */
    private String code;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 水泵名
     */
    private String name;

    /**
     * 起始节点
     */
    private String startNodeCode;

    /**
     * 终止节点
     */
    private String endNodeCode;

    /**
     * 起始节点ID
     */
    private Long startNodeId;

    /**
     * 终止节点ID
     */
    private Long endNodeId;

    /**
     * 起始节点经度
     */
    private Double startLongitude;

    /**
     * 起始节点维度
     */
    private Double startLatitude;

    /**
     * 终止节点经度
     */
    private Double endLongitude;

    /**
     * 终止节点维度
     */
    private Double endLatitude;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 管网id
     */
    private Long networkId;

    /**
     * 位置
     */
    private String location;

    /**
     * 描述
     */
    private String describeContent;

    /**
     * 标签
     */
    private String label;

    /**
     * 埋深
     */
    private Double deep;

    /**
     * 口径
     */
    private Double diameter;

    /**
     * 高程
     */
    private Double elev;

    /**
     * 水泵曲线的ID标签
     */
    private String curveId;

    /**
     * 功率 千瓦
     */
    private Double power;

    /**
     * 转速比
     */
    private Double speedRatio;

    /**
     * 时间模式的ID标签
     */
    private String timePatternId;

    /**
     * 初始状态（OPEN:开启, CLOSED:关闭或CV:止回阀）
     */
    private String initStatus;

    /**
     * 曲线的ID标签
     */
    private String efficiencyCurveId;

    /**
     * 能量价格 千瓦-小时
     */
    private Double energyPrices;

    /**
     * 时间模式的ID标签
     */
    private String pricesPatternId;

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

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    /**
     * 获取水泵名
     *
     * @return name - 水泵名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置水泵名
     *
     * @param name 水泵名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取起始节点
     *
     * @return start_node_code - 起始节点
     */
    public String getStartNodeCode() {
        return startNodeCode;
    }

    /**
     * 设置起始节点
     *
     * @param startNodeCode 起始节点
     */
    public void setStartNodeCode(String startNodeCode) {
        this.startNodeCode = startNodeCode;
    }

    /**
     * 获取终止节点
     *
     * @return end_node_code - 终止节点
     */
    public String getEndNodeCode() {
        return endNodeCode;
    }

    /**
     * 设置终止节点
     *
     * @param endNodeCode 终止节点
     */
    public void setEndNodeCode(String endNodeCode) {
        this.endNodeCode = endNodeCode;
    }

    /**
     * 获取起始节点ID
     *
     * @return start_node_id - 起始节点ID
     */
    public Long getStartNodeId() {
        return startNodeId;
    }

    /**
     * 设置起始节点ID
     *
     * @param startNodeId 起始节点ID
     */
    public void setStartNodeId(Long startNodeId) {
        this.startNodeId = startNodeId;
    }

    /**
     * 获取终止节点ID
     *
     * @return end_node_id - 终止节点ID
     */
    public Long getEndNodeId() {
        return endNodeId;
    }

    /**
     * 设置终止节点ID
     *
     * @param endNodeId 终止节点ID
     */
    public void setEndNodeId(Long endNodeId) {
        this.endNodeId = endNodeId;
    }

    /**
     * 获取起始节点经度
     *
     * @return start_longitude - 起始节点经度
     */
    public Double getStartLongitude() {
        return startLongitude;
    }

    /**
     * 设置起始节点经度
     *
     * @param startLongitude 起始节点经度
     */
    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    /**
     * 获取起始节点维度
     *
     * @return start_latitude - 起始节点维度
     */
    public Double getStartLatitude() {
        return startLatitude;
    }

    /**
     * 设置起始节点维度
     *
     * @param startLatitude 起始节点维度
     */
    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    /**
     * 获取终止节点经度
     *
     * @return end_longitude - 终止节点经度
     */
    public Double getEndLongitude() {
        return endLongitude;
    }

    /**
     * 设置终止节点经度
     *
     * @param endLongitude 终止节点经度
     */
    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    /**
     * 获取终止节点维度
     *
     * @return end_latitude - 终止节点维度
     */
    public Double getEndLatitude() {
        return endLatitude;
    }

    /**
     * 设置终止节点维度
     *
     * @param endLatitude 终止节点维度
     */
    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
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
     * 获取埋深
     *
     * @return deep - 埋深
     */
    public Double getDeep() {
        return deep;
    }

    /**
     * 设置埋深
     *
     * @param deep 埋深
     */
    public void setDeep(Double deep) {
        this.deep = deep;
    }

    /**
     * 获取口径
     *
     * @return diameter - 口径
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * 设置口径
     *
     * @param diameter 口径
     */
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * 获取高程
     *
     * @return elev - 高程
     */
    public Double getElev() {
        return elev;
    }

    /**
     * 设置高程
     *
     * @param elev 高程
     */
    public void setElev(Double elev) {
        this.elev = elev;
    }

    /**
     * 获取水泵曲线的ID标签
     *
     * @return curve_id - 水泵曲线的ID标签
     */
    public String getCurveId() {
        return curveId;
    }

    /**
     * 设置水泵曲线的ID标签
     *
     * @param curveId 水泵曲线的ID标签
     */
    public void setCurveId(String curveId) {
        this.curveId = curveId;
    }

    /**
     * 获取功率 千瓦
     *
     * @return power - 功率 千瓦
     */
    public Double getPower() {
        return power;
    }

    /**
     * 设置功率 千瓦
     *
     * @param power 功率 千瓦
     */
    public void setPower(Double power) {
        this.power = power;
    }

    /**
     * 获取转速比
     *
     * @return speed_ratio - 转速比
     */
    public Double getSpeedRatio() {
        return speedRatio;
    }

    /**
     * 设置转速比
     *
     * @param speedRatio 转速比
     */
    public void setSpeedRatio(Double speedRatio) {
        this.speedRatio = speedRatio;
    }

    /**
     * 获取时间模式的ID标签
     *
     * @return time_pattern_id - 时间模式的ID标签
     */
    public String getTimePatternId() {
        return timePatternId;
    }

    /**
     * 设置时间模式的ID标签
     *
     * @param timePatternId 时间模式的ID标签
     */
    public void setTimePatternId(String timePatternId) {
        this.timePatternId = timePatternId;
    }

    /**
     * 获取初始状态（OPEN:开启, CLOSED:关闭或CV:止回阀）
     *
     * @return init_status - 初始状态（OPEN:开启, CLOSED:关闭或CV:止回阀）
     */
    public String getInitStatus() {
        return initStatus;
    }

    /**
     * 设置初始状态（OPEN:开启, CLOSED:关闭或CV:止回阀）
     *
     * @param initStatus 初始状态（OPEN:开启, CLOSED:关闭或CV:止回阀）
     */
    public void setInitStatus(String initStatus) {
        this.initStatus = initStatus;
    }

    /**
     * 获取曲线的ID标签
     *
     * @return efficiency_curve_id - 曲线的ID标签
     */
    public String getEfficiencyCurveId() {
        return efficiencyCurveId;
    }

    /**
     * 设置曲线的ID标签
     *
     * @param efficiencyCurveId 曲线的ID标签
     */
    public void setEfficiencyCurveId(String efficiencyCurveId) {
        this.efficiencyCurveId = efficiencyCurveId;
    }

    /**
     * 获取能量价格 千瓦-小时
     *
     * @return energy_ prices - 能量价格 千瓦-小时
     */
    public Double getEnergyPrices() {
        return energyPrices;
    }

    /**
     * 设置能量价格 千瓦-小时
     *
     * @param energyPrices 能量价格 千瓦-小时
     */
    public void setEnergyPrices(Double energyPrices) {
        this.energyPrices = energyPrices;
    }

    /**
     * 获取时间模式的ID标签
     *
     * @return prices_pattern_id - 时间模式的ID标签
     */
    public String getPricesPatternId() {
        return pricesPatternId;
    }

    /**
     * 设置时间模式的ID标签
     *
     * @param pricesPatternId 时间模式的ID标签
     */
    public void setPricesPatternId(String pricesPatternId) {
        this.pricesPatternId = pricesPatternId;
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
        return "OcPump{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", schemeId=" + schemeId +
                ", name='" + name + '\'' +
                ", startNodeCode='" + startNodeCode + '\'' +
                ", endNodeCode='" + endNodeCode + '\'' +
                ", startNodeId=" + startNodeId +
                ", endNodeId=" + endNodeId +
                ", startLongitude=" + startLongitude +
                ", startLatitude=" + startLatitude +
                ", endLongitude=" + endLongitude +
                ", endLatitude=" + endLatitude +
                ", modelId=" + modelId +
                ", networkId=" + networkId +
                ", location='" + location + '\'' +
                ", describeContent='" + describeContent + '\'' +
                ", label='" + label + '\'' +
                ", deep=" + deep +
                ", diameter=" + diameter +
                ", elev=" + elev +
                ", curveId='" + curveId + '\'' +
                ", power=" + power +
                ", speedRatio=" + speedRatio +
                ", timePatternId='" + timePatternId + '\'' +
                ", initStatus='" + initStatus + '\'' +
                ", efficiencyCurveId='" + efficiencyCurveId + '\'' +
                ", energyPrices=" + energyPrices +
                ", pricesPatternId='" + pricesPatternId + '\'' +
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