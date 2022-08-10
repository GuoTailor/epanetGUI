package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcPoint implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * epanet id
     */
    private String code;

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
     * 节点类型
     */
    private String nodeType;

    /**
     * 节点名
     */
    private String name;

    /**
     * 模型id
     */
    private Long modelId;

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
     * 标高(米)
     */
    private Double elev;

    /**
     * 基本需水量
     */
    private Double basicDemand;

    /**
     * 时间模式的ID标签
     */
    private String timePatternId;

    /**
     * 需水量的id标签
     */
    private String demandTypeId;

    /**
     * 射流点系数
     */
    private Double coefficient;

    /**
     * 初始水质
     */
    private Double initialQuality;

    /**
     * 源头水质id
     */
    private Long sourceQualityId;

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
     * 获取节点类型
     *
     * @return node_type - 节点类型
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 设置节点类型
     *
     * @param nodeType 节点类型
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * 获取节点名
     *
     * @return name - 节点名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置节点名
     *
     * @param name 节点名
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取基本需水量
     *
     * @return basic_demand - 基本需水量
     */
    public Double getBasicDemand() {
        return basicDemand;
    }

    /**
     * 设置基本需水量
     *
     * @param basicDemand 基本需水量
     */
    public void setBasicDemand(Double basicDemand) {
        this.basicDemand = basicDemand;
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
     * 获取需水量的id标签
     *
     * @return demand_type_id - 需水量的id标签
     */
    public String getDemandTypeId() {
        return demandTypeId;
    }

    /**
     * 设置需水量的id标签
     *
     * @param demandTypeId 需水量的id标签
     */
    public void setDemandTypeId(String demandTypeId) {
        this.demandTypeId = demandTypeId;
    }

    /**
     * 获取射流点系数
     *
     * @return coefficient - 射流点系数
     */
    public Double getCoefficient() {
        return coefficient;
    }

    /**
     * 设置射流点系数
     *
     * @param coefficient 射流点系数
     */
    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
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
     * @return source_quality_id - 源头水质id
     */
    public Long getSourceQualityId() {
        return sourceQualityId;
    }

    /**
     * 设置源头水质id
     *
     * @param sourceQualityId 源头水质id
     */
    public void setSourceQualityId(Long sourceQualityId) {
        this.sourceQualityId = sourceQualityId;
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
        return "OcPoint{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", networkId=" + networkId +
                ", schemeId=" + schemeId +
                ", location='" + location + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", name='" + name + '\'' +
                ", modelId=" + modelId +
                ", pointX=" + pointX +
                ", pointY=" + pointY +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", describeContent='" + describeContent + '\'' +
                ", label='" + label + '\'' +
                ", deep=" + deep +
                ", diameter=" + diameter +
                ", elev=" + elev +
                ", basicDemand=" + basicDemand +
                ", timePatternId='" + timePatternId + '\'' +
                ", demandTypeId='" + demandTypeId + '\'' +
                ", coefficient=" + coefficient +
                ", initialQuality=" + initialQuality +
                ", sourceQualityId=" + sourceQualityId +
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