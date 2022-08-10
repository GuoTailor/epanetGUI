package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OcEnergy implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 水泵效率
     */
    private BigDecimal effic;

    /**
     * 能量价格
     */
    private BigDecimal price;

    /**
     * 时间模式ID标签
     */
    private String timePatternId;

    /**
     * 需电量
     */
    private BigDecimal demandCharge;

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
    public Long getSchemeId() {
        return schemeId;
    }

    /**
     * 设置方案id
     *
     * @param schemeId 方案id
     */
    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    /**
     * 获取水泵效率
     *
     * @return effic - 水泵效率
     */
    public BigDecimal getEffic() {
        return effic;
    }

    /**
     * 设置水泵效率
     *
     * @param effic 水泵效率
     */
    public void setEffic(BigDecimal effic) {
        this.effic = effic;
    }

    /**
     * 获取能量价格
     *
     * @return price - 能量价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置能量价格
     *
     * @param price 能量价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取时间模式ID标签
     *
     * @return time_pattern_id - 时间模式ID标签
     */
    public String getTimePatternId() {
        return timePatternId;
    }

    /**
     * 设置时间模式ID标签
     *
     * @param timePatternId 时间模式ID标签
     */
    public void setTimePatternId(String timePatternId) {
        this.timePatternId = timePatternId;
    }

    /**
     * 获取需电量
     *
     * @return demand_charge - 需电量
     */
    public BigDecimal getDemandCharge() {
        return demandCharge;
    }

    /**
     * 设置需电量
     *
     * @param demandCharge 需电量
     */
    public void setDemandCharge(BigDecimal demandCharge) {
        this.demandCharge = demandCharge;
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
        sb.append(", schemeId=").append(schemeId);
        sb.append(", effic=").append(effic);
        sb.append(", price=").append(price);
        sb.append(", timePatternId=").append(timePatternId);
        sb.append(", demandCharge=").append(demandCharge);
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
}