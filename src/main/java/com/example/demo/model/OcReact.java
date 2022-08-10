package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OcReact implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 主流反应
     */
    private BigDecimal bulk;

    /**
     * 管壁反应
     */
    private Double wall;

    /**
     * 水池反应
     */
    private Double tank;

    /**
     * 全局主流反应
     */
    private BigDecimal globalBulk;

    /**
     * 全局管壁系数
     */
    private BigDecimal globalWall;

    /**
     * 浓度限值
     */
    private BigDecimal limiting;

    /**
     * 管壁反应相关性
     */
    private BigDecimal correlation;

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
     * 获取主流反应
     *
     * @return bulk - 主流反应
     */
    public BigDecimal getBulk() {
        return bulk;
    }

    /**
     * 设置主流反应
     *
     * @param bulk 主流反应
     */
    public void setBulk(BigDecimal bulk) {
        this.bulk = bulk;
    }

    /**
     * 获取管壁反应
     *
     * @return wall - 管壁反应
     */
    public Double getWall() {
        return wall;
    }

    /**
     * 设置管壁反应
     *
     * @param wall 管壁反应
     */
    public void setWall(Double wall) {
        this.wall = wall;
    }

    /**
     * 获取全局主流反应
     *
     * @return global_bulk - 全局主流反应
     */
    public BigDecimal getGlobalBulk() {
        return globalBulk;
    }

    /**
     * 设置全局主流反应
     *
     * @param globalBulk 全局主流反应
     */
    public void setGlobalBulk(BigDecimal globalBulk) {
        this.globalBulk = globalBulk;
    }

    /**
     * 获取全局管壁系数
     *
     * @return global_wall - 全局管壁系数
     */
    public BigDecimal getGlobalWall() {
        return globalWall;
    }

    /**
     * 设置全局管壁系数
     *
     * @param globalWall 全局管壁系数
     */
    public void setGlobalWall(BigDecimal globalWall) {
        this.globalWall = globalWall;
    }

    /**
     * 获取浓度限值
     *
     * @return limiting - 浓度限值
     */
    public BigDecimal getLimiting() {
        return limiting;
    }

    /**
     * 设置浓度限值
     *
     * @param limiting 浓度限值
     */
    public void setLimiting(BigDecimal limiting) {
        this.limiting = limiting;
    }

    public Double getTank() {
        return tank;
    }

    public void setTank(Double tank) {
        this.tank = tank;
    }

    /**
     * 获取管壁反应相关性
     *
     * @return correlation - 管壁反应相关性
     */
    public BigDecimal getCorrelation() {
        return correlation;
    }

    /**
     * 设置管壁反应相关性
     *
     * @param correlation 管壁反应相关性
     */
    public void setCorrelation(BigDecimal correlation) {
        this.correlation = correlation;
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
        sb.append(", bulk=").append(bulk);
        sb.append(", wall=").append(wall);
        sb.append(", globalBulk=").append(globalBulk);
        sb.append(", globalWall=").append(globalWall);
        sb.append(", limiting=").append(limiting);
        sb.append(", correlation=").append(correlation);
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