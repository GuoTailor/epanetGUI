package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcSource implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 水质名
     */
    private String name;

    /**
     * 节点ID标签
     */
    private String nodeCode;
    /**
     * 方案id
     */
    private Long schemeId;
    /**
     * 模型id
     */
    private Long modelId;
    /**
     * 节点id
     */
    private Long nodeId;

    /**
     * 源头类型（CONCEN, MASS, FLOWPACED或SETPOINT）
     */
    private String type;

    /**
     * 基准源头强度
     */
    private Double strength;

    /**
     * 时间模式ID
     */
    private String timePatternId;

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
     * 获取水质名
     *
     * @return name - 水质名
     */
    public String getName() {
        return name;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 设置水质名
     *
     * @param name 水质名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取节点ID标签
     *
     * @return node_id - 节点ID标签
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * 设置节点ID标签
     *
     * @param nodeCode 节点ID标签
     */
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    /**
     * 获取源头类型（CONCEN, MASS, FLOWPACED或SETPOINT）
     *
     * @return type - 源头类型（CONCEN, MASS, FLOWPACED或SETPOINT）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置源头类型（CONCEN, MASS, FLOWPACED或SETPOINT）
     *
     * @param type 源头类型（CONCEN, MASS, FLOWPACED或SETPOINT）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取基准源头强度
     *
     * @return strength - 基准源头强度
     */
    public Double getStrength() {
        return strength;
    }

    /**
     * 设置基准源头强度
     *
     * @param strength 基准源头强度
     */
    public void setStrength(Double strength) {
        this.strength = strength;
    }

    /**
     * 获取时间模式ID
     *
     * @return time_pattern_id - 时间模式ID
     */
    public String getTimePatternId() {
        return timePatternId;
    }

    /**
     * 设置时间模式ID
     *
     * @param timePatternId 时间模式ID
     */
    public void setTimePatternId(String timePatternId) {
        this.timePatternId = timePatternId;
    }

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
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
        return "OcSource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nodeCode='" + nodeCode + '\'' +
                ", schemeId=" + schemeId +
                ", modelId=" + modelId +
                ", nodeId=" + nodeId +
                ", type='" + type + '\'' +
                ", strength=" + strength +
                ", timePatternId='" + timePatternId + '\'' +
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