package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcCurve implements Serializable {
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
     * 模型id
     */
    private Long modelId;

    /**
     * 曲线名
     */
    private String name;

    /**
     * 曲线类型包括1.水泵, 2.效率, 3.容积和4.水头损失
     */
    private Integer type;

    /**
     * x数值
     */
    private Double xValue;

    /**
     * y数值
     */
    private Double yValue;

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

    public enum CurveType {
        H_CURVE(1),    // pump curve
        P_CURVE(2),    // efficiency curve
        E_CURVE(3),    // volume curve
        V_CURVE(4);    // head loss curve

        public final int id;

        CurveType(int val) {
            id = val;
        }

        public static boolean examine(int id) {
            return H_CURVE.id == id
                    || P_CURVE.id == id
                    || E_CURVE.id == id
                    || V_CURVE.id == id;
        }

    }

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
     * 获取曲线名
     *
     * @return name - 曲线名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置曲线名
     *
     * @param name 曲线名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取曲线类型包括1.水泵, 2.效率, 3.容积和4.水头损失
     *
     * @return type - 曲线类型包括1.水泵, 2.效率, 3.容积和4.水头损失
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置曲线类型包括1.水泵, 2.效率, 3.容积和4.水头损失
     *
     * @param type 曲线类型包括1.水泵, 2.效率, 3.容积和4.水头损失
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取x数值
     *
     * @return x_value - x数值
     */
    public Double getxValue() {
        return xValue;
    }

    /**
     * 设置x数值
     *
     * @param xValue x数值
     */
    public void setxValue(Double xValue) {
        this.xValue = xValue;
    }

    /**
     * 获取y数值
     *
     * @return y_value - y数值
     */
    public Double getyValue() {
        return yValue;
    }

    /**
     * 设置y数值
     *
     * @param yValue y数值
     */
    public void setyValue(Double yValue) {
        this.yValue = yValue;
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
        sb.append(", type=").append(type);
        sb.append(", xValue=").append(xValue);
        sb.append(", yValue=").append(yValue);
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