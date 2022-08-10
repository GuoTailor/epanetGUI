package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcPipe implements Serializable {
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
     * 管道名字
     */
    private String name;

    /**
     * 模型id
     */
    private Long modelId;

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
     * 起始埋深
     */
    private Double startDeep;

    /**
     * 终止埋深
     */
    private Double endDeep;

    /**
     * 起始高程
     */
    private Double startElev;

    /**
     * 终止高程
     */
    private Double endElev;

    /**
     * 材质
     */
    private String material;

    /**
     * 描述
     */
    private String describeContent;

    /**
     * 标签
     */
    private String label;

    /**
     * 长度(米)
     */
    private Double length;

    /**
     * 直径(mm)
     */
    private Double diameter;

    /**
     * 粗糙系数
     */
    private Double roughness;

    /**
     * 损失系数
     */
    private Double minorLoss;

    /**
     * 初始状态（OPEN：开启,CLOSED：关闭或CV：止回阀）
     */
    private String initStatus;

    /**
     * 主流反应系数
     */
    private Double mainstream;

    /**
     * 管壁系数
     */
    private Double tubeWall;

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
     * 获取管道名字
     *
     * @return name - 管道名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置管道名字
     *
     * @param name 管道名字
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
     * 获取起始埋深
     *
     * @return start_deep - 起始埋深
     */
    public Double getStartDeep() {
        return startDeep;
    }

    /**
     * 设置起始埋深
     *
     * @param startDeep 起始埋深
     */
    public void setStartDeep(Double startDeep) {
        this.startDeep = startDeep;
    }

    /**
     * 获取终止埋深
     *
     * @return end_deep - 终止埋深
     */
    public Double getEndDeep() {
        return endDeep;
    }

    /**
     * 设置终止埋深
     *
     * @param endDeep 终止埋深
     */
    public void setEndDeep(Double endDeep) {
        this.endDeep = endDeep;
    }

    /**
     * 获取起始高程
     *
     * @return start_elev - 起始高程
     */
    public Double getStartElev() {
        return startElev;
    }

    /**
     * 设置起始高程
     *
     * @param startElev 起始高程
     */
    public void setStartElev(Double startElev) {
        this.startElev = startElev;
    }

    /**
     * 获取终止高程
     *
     * @return end_elev - 终止高程
     */
    public Double getEndElev() {
        return endElev;
    }

    /**
     * 设置终止高程
     *
     * @param endElev 终止高程
     */
    public void setEndElev(Double endElev) {
        this.endElev = endElev;
    }

    /**
     * 获取材质
     *
     * @return material - 材质
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置材质
     *
     * @param material 材质
     */
    public void setMaterial(String material) {
        this.material = material;
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
     * 获取长度(米)
     *
     * @return length - 长度(米)
     */
    public Double getLength() {
        return length;
    }

    /**
     * 设置长度(米)
     *
     * @param length 长度(米)
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * 获取直径(mm)
     *
     * @return diameter - 直径(mm)
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * 设置直径(mm)
     *
     * @param diameter 直径(mm)
     */
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    /**
     * 获取粗糙系数
     *
     * @return roughness - 粗糙系数
     */
    public Double getRoughness() {
        return roughness;
    }

    /**
     * 设置粗糙系数
     *
     * @param roughness 粗糙系数
     */
    public void setRoughness(Double roughness) {
        this.roughness = roughness;
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
     * 获取初始状态（OPEN：开启,CLOSED：关闭或CV：止回阀）
     *
     * @return init_status - 初始状态（OPEN：开启,CLOSED：关闭或CV：止回阀）
     */
    public String getInitStatus() {
        return initStatus;
    }

    /**
     * 设置初始状态（OPEN：开启,CLOSED：关闭或CV：止回阀）
     *
     * @param initStatus 初始状态（OPEN：开启,CLOSED：关闭或CV：止回阀）
     */
    public void setInitStatus(String initStatus) {
        this.initStatus = initStatus;
    }

    /**
     * 获取主流反应系数
     *
     * @return mainstream - 主流反应系数
     */
    public Double getMainstream() {
        return mainstream;
    }

    /**
     * 设置主流反应系数
     *
     * @param mainstream 主流反应系数
     */
    public void setMainstream(Double mainstream) {
        this.mainstream = mainstream;
    }

    /**
     * 获取管壁系数
     *
     * @return tube_wall - 管壁系数
     */
    public Double getTubeWall() {
        return tubeWall;
    }

    /**
     * 设置管壁系数
     *
     * @param tubeWall 管壁系数
     */
    public void setTubeWall(Double tubeWall) {
        this.tubeWall = tubeWall;
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
        return "OcPipe{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", networkId=" + networkId +
                ", schemeId=" + schemeId +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", modelId=" + modelId +
                ", startNodeCode='" + startNodeCode + '\'' +
                ", endNodeCode='" + endNodeCode + '\'' +
                ", startNodeId=" + startNodeId +
                ", endNodeId=" + endNodeId +
                ", startLongitude=" + startLongitude +
                ", startLatitude=" + startLatitude +
                ", endLongitude=" + endLongitude +
                ", endLatitude=" + endLatitude +
                ", startDeep=" + startDeep +
                ", endDeep=" + endDeep +
                ", startElev=" + startElev +
                ", endElev=" + endElev +
                ", material='" + material + '\'' +
                ", describeContent='" + describeContent + '\'' +
                ", label='" + label + '\'' +
                ", length=" + length +
                ", diameter=" + diameter +
                ", roughness=" + roughness +
                ", minorLoss=" + minorLoss +
                ", initStatus='" + initStatus + '\'' +
                ", mainstream=" + mainstream +
                ", tubeWall=" + tubeWall +
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