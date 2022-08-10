package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class OcPattern implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * epanet id
     */
    private String code;

    /**
     * 模式名
     */
    private String name;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 选择性描述
     */
    private String description;

    /**
     * 模式每一时间段的乘子，用空格分割
     */
    private String multipliers;

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

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取模式名
     *
     * @return name - 模式名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模式名
     *
     * @param name 模式名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取选择性描述
     *
     * @return description - 选择性描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置选择性描述
     *
     * @param description 选择性描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取模式每一时间段的乘子，用空格分割
     *
     * @return multipliers - 模式每一时间段的乘子，用空格分割
     */
    public String getMultipliers() {
        return multipliers;
    }

    /**
     * 设置模式每一时间段的乘子，用空格分割
     *
     * @param multipliers 模式每一时间段的乘子，用空格分割
     */
    public void setMultipliers(String multipliers) {
        this.multipliers = multipliers;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", multipliers=").append(multipliers);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatorId=").append(updatorId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OcPattern ocPattern = (OcPattern) o;
        return code.equals(ocPattern.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}