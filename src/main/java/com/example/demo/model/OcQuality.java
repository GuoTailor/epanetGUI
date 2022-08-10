package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OcQuality implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 名称
     */
    private String name;

    /**
     * 被模拟水质参数的类型。选择包括：
     * NONE: 无（没有水质分析），
     * AGE: 水龄（计算水龄），
     * CHEMICAL: 化学成分（计算物质浓度），
     * TRACE: 跟踪（跟踪来自特定节点的流量百分比）。
     */
    private String type;

    /**
     * 用于表达浓度的物质单位。选择为：
     * mg/l(毫克/升）
     * μg/L(微克/升）
     * H(小时)
     * %（百分比）
     * 水龄和跟踪分析中的单位分别设定为小时和百分比。
     */
    private String unit;

    /**
     * 跟踪节点 流量被跟踪的节点ID标签
     */
    private String node;

    /**
     * 被模拟物质分子扩散与20℃时氯的扩散之比
     */
    private BigDecimal diffusivity;

    /**
     * 水质公差
     */
    private BigDecimal tolerance;

    /**
     * 描述
     */
    private String description;

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

    public enum OcQualityType {
        NONE("NONE", 1),
        AGE("AGE", 2),
        CHEMICAL("CHEMICAL", 3),
        TRACE("TRACE", 4);

        public final String name;
        public final Integer id;

        OcQualityType(String name, Integer id) {
            this.id = id;
            this.name = name;
        }

        public static boolean examine(String name) {
            return NONE.name.equals(name)
                    || CHEMICAL.name.equals(name)
                    || AGE.name.equals(name)
                    || TRACE.name.equals(name);
        }

        public String getName() {
            return name;
        }

        public Integer getId() {
            return id;
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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 被模拟水质参数的类型。选择包括：
     * NONE: 无（没有水质分析），
     * AGE: 水龄（计算水龄），
     * CHEMICAL: 化学成分（计算物质浓度），
     * TRACE: 跟踪（跟踪来自特定节点的流量百分比）。
     */
    public String getType() {
        return type;
    }

    /**
     * 被模拟水质参数的类型。选择包括：
     * NONE: 无（没有水质分析），
     * AGE: 水龄（计算水龄），
     * CHEMICAL: 化学成分（计算物质浓度），
     * TRACE: 跟踪（跟踪来自特定节点的流量百分比）。
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取用于表达浓度的物质单位。选择为：
     * mg/L(毫克/升）
     * μg/L(微克/升）
     * H(小时)
     * %（百分比）
     * 水龄和跟踪分析中的单位分别设定为小时和百分比。
     *
     * @return unit - 用于表达浓度的物质单位。选择为：
     * mg/L(毫克/升）
     * μg/L(微克/升）
     * H(小时)
     * %（百分比）
     * 水龄和跟踪分析中的单位分别设定为小时和百分比。
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置用于表达浓度的物质单位。选择为：
     * 1:mg/L(毫克/升）
     * 2:μg/L(微克/升）
     * 3:H(小时)
     * 4:%（百分比）
     * 水龄和跟踪分析中的单位分别设定为小时和百分比。
     *
     * @param unit 用于表达浓度的物质单位。选择为：
     *             1:mg/L(毫克/升）
     *             2:μg/L(微克/升）
     *             3:H(小时)
     *             4:%（百分比）
     *             水龄和跟踪分析中的单位分别设定为小时和百分比。
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取跟踪节点 流量被跟踪的节点ID标签
     *
     * @return node - 跟踪节点 流量被跟踪的节点ID标签
     */
    public String getNode() {
        return node;
    }

    /**
     * 设置跟踪节点 流量被跟踪的节点ID标签
     *
     * @param node 跟踪节点 流量被跟踪的节点ID标签
     */
    public void setNode(String node) {
        this.node = node;
    }

    /**
     * 获取被模拟物质分子扩散与20℃时氯的扩散之比
     *
     * @return diffusivity - 被模拟物质分子扩散与20℃时氯的扩散之比
     */
    public BigDecimal getDiffusivity() {
        return diffusivity;
    }

    /**
     * 设置被模拟物质分子扩散与20℃时氯的扩散之比
     *
     * @param diffusivity 被模拟物质分子扩散与20℃时氯的扩散之比
     */
    public void setDiffusivity(BigDecimal diffusivity) {
        this.diffusivity = diffusivity;
    }

    /**
     * 获取水质公差
     *
     * @return tolerance - 水质公差
     */
    public BigDecimal getTolerance() {
        return tolerance;
    }

    /**
     * 设置水质公差
     *
     * @param tolerance 水质公差
     */
    public void setTolerance(BigDecimal tolerance) {
        this.tolerance = tolerance;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", unit=").append(unit);
        sb.append(", node=").append(node);
        sb.append(", diffusivity=").append(diffusivity);
        sb.append(", tolerance=").append(tolerance);
        sb.append(", description=").append(description);
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