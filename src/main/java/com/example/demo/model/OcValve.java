package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;


public class OcValve implements Serializable {
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
     * 阀门名
     */
    private String name;

    /**
     * 阀门名
     */
    private String nodeType;

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
     * 描述
     */
    private String describeContent;

    /**
     * 标签
     */
    private String label;

    /**
     * 标高
     */
    private Double elev;

    /**
     * 埋深
     */
    private Double deep;

    /**
     * 阀门口径
     */
    private Double diameter;

    /**
     * 阀门类型（PRV, PSV, PBV, FCV, TCV或者GPV）
     */
    private String type;

    /**
     * 描述阀门运行设置必须设置的参数
     * 阀门类型 设置参数
     * PRV 压强（m或psi）
     * PSV 压强（m或psi）
     * PBV 压强（m或psi）
     * FCV 流量（流量单位）
     * TCV 损失系数（无量纲）
     * GPV 水头损失曲线的ID
     */
    private Double setting;

    /**
     * 损失系数
     */
    private Double minorLoss;

    /**
     * 模拟开始时的阀门状态
     * None
     * Open
     * Closed
     */
    private String steadyState;

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
     * 获取阀门名
     *
     * @return name - 阀门名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置阀门名
     *
     * @param name 阀门名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取阀门名
     *
     * @return node_type - 阀门名
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 设置阀门名
     *
     * @param nodeType 阀门名
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
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
     * 获取标高
     *
     * @return elev - 标高
     */
    public Double getElev() {
        return elev;
    }

    /**
     * 设置标高
     *
     * @param elev 标高
     */
    public void setElev(Double elev) {
        this.elev = elev;
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
     * 获取阀门口径
     *
     * @return diameter - 阀门口径
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * 设置阀门口径
     *
     * @param diameter 阀门口径
     */
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * 获取阀门类型（PRV, PSV, PBV, FCV, TCV或者GPV）
     *
     * @return type - 阀门类型（PRV, PSV, PBV, FCV, TCV或者GPV）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置阀门类型（PRV, PSV, PBV, FCV, TCV或者GPV）
     *
     * @param type 阀门类型（PRV, PSV, PBV, FCV, TCV或者GPV）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取描述阀门运行设置必须设置的参数
     * 阀门类型 设置参数
     * PRV 压强（m或psi）
     * PSV 压强（m或psi）
     * PBV 压强（m或psi）
     * FCV 流量（流量单位）
     * TCV 损失系数（无量纲）
     * GPV 水头损失曲线的ID
     *
     * @return setting - 描述阀门运行设置必须设置的参数
     * 阀门类型 设置参数
     * PRV 压强（m或psi）
     * PSV 压强（m或psi）
     * PBV 压强（m或psi）
     * FCV 流量（流量单位）
     * TCV 损失系数（无量纲）
     * GPV 水头损失曲线的ID
     */
    public Double getSetting() {
        return setting;
    }

    /**
     * 设置描述阀门运行设置必须设置的参数
     * 阀门类型 设置参数
     * PRV 压强（m或psi）
     * PSV 压强（m或psi）
     * PBV 压强（m或psi）
     * FCV 流量（流量单位）
     * TCV 损失系数（无量纲）
     * GPV 水头损失曲线的ID
     *
     * @param setting 描述阀门运行设置必须设置的参数
     *                阀门类型 设置参数
     *                PRV 压强（m或psi）
     *                PSV 压强（m或psi）
     *                PBV 压强（m或psi）
     *                FCV 流量（流量单位）
     *                TCV 损失系数（无量纲）
     *                GPV 水头损失曲线的ID
     */
    public void setSetting(Double setting) {
        this.setting = setting;
    }

    /**
     * 获取损失系数
     *
     * @return minor_loss - 损失系数
     */
    public Double getMinorLoss() {
        return minorLoss;
    }

    /**
     * 设置损失系数
     *
     * @param minorLoss 损失系数
     */
    public void setMinorLoss(Double minorLoss) {
        this.minorLoss = minorLoss;
    }

    /**
     * 获取模拟开始时的阀门状态
     * None
     * Open
     * Closed
     *
     * @return steady_state - 模拟开始时的阀门状态
     * None
     * Open
     * Closed
     */
    public String getSteadyState() {
        return steadyState;
    }

    /**
     * 设置模拟开始时的阀门状态
     * None
     * Open
     * Closed
     *
     * @param steadyState 模拟开始时的阀门状态
     *                    None
     *                    Open
     *                    Closed
     */
    public void setSteadyState(String steadyState) {
        this.steadyState = steadyState;
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
        return "OcValve{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", networkId=" + networkId +
                ", schemeId=" + schemeId +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", startNodeCode='" + startNodeCode + '\'' +
                ", endNodeCode='" + endNodeCode + '\'' +
                ", startNodeId=" + startNodeId +
                ", endNodeId=" + endNodeId +
                ", startLongitude=" + startLongitude +
                ", startLatitude=" + startLatitude +
                ", endLongitude=" + endLongitude +
                ", endLatitude=" + endLatitude +
                ", modelId=" + modelId +
                ", describeContent='" + describeContent + '\'' +
                ", label='" + label + '\'' +
                ", elev=" + elev +
                ", deep=" + deep +
                ", diameter=" + diameter +
                ", type='" + type + '\'' +
                ", setting=" + setting +
                ", minorLoss=" + minorLoss +
                ", steadyState='" + steadyState + '\'' +
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