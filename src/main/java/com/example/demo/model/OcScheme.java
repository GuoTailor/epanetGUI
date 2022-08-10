package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OcScheme implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 模型id
     */
    private Long modelId;

    /**
     * 方案类型：1:基础方案,2:水龄方案,3:余氯方案,4:路径方案
     */
    private Integer solutionType;

    /**
     * 流量单位
     * LPS（升/秒）
     * LPM（升/分）
     * MLD（兆升/日）
     * CMH（立方米/时）
     * CMD（立方米/日）
     */
    private String fluxUnit;

    /**
     * 计算水头损失使用的公式为：
     * HAZEN-WILLIAMS
     * DARCY-WEISBACH
     * CHEZY-MANNING
     */
    private String loss;

    /**
     * 最大试算次数
     */
    private Integer calculate;

    /**
     * 比重
     */
    private BigDecimal proportion;

    /**
     * 相对粘度
     */
    private BigDecimal viscosity;

    /**
     * 精度
     */
    private BigDecimal accuracy;

    /**
     * 缺省模式下时间模式ID标签
     */
    private String defaultModeId;

    /**
     * 需水量乘子
     * 使得整个系统耗水量以固定的量变化，例如2.0为所有需水量的二倍，0.5则减半，1.0不变
     */
    private BigDecimal demandRate;

    /**
     * 射流点指数
     */
    private BigDecimal exponent;

    /**
     * 平衡度
     * 选择STOP:停止，停止在该点的模拟；或者CONTINUE:继续，
     * 使用另外10次试算
     */
    private String balance;

    /**
     * 状态报告
     * 在分析之后，报告状态信息的数量。选择为：
     * NO:否（没有状态报告）
     * YES:是（常规状态报告--列出模拟过程中所有管道状态的变化）
     * FULL:所有（完整报告—列出每一次水力分析试算，每一时段的常规报告加上收敛误差）
     * 完整状态报告仅仅用于调试。
     */
    private String report;

    /**
     * 简单控制
     */
    private String simpleControl;

    /**
     * 规则控制
     */
    private String ruleControl;

    /**
     * 最后模拟时间
     */
    private Date finalSimulateTime;

    /**
     * 运行状态(1:未执行,2:已执行,3:执行中,4:执行失败)
     */
    private Integer runStatus;

    /**
     * 默认方案：1-否，2-是
     */
    private Integer defaultScheme;

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

    public enum OcSchemeType {
        BASE(1),
        HYDROCHRONOLOGY(2),
        CHLORINE(3),
        PATH(4);

        public final int id;

        OcSchemeType(int val) {
            id = val;
        }

        public static boolean examine(int id) {
            return BASE.id == id
                    || HYDROCHRONOLOGY.id == id
                    || CHLORINE.id == id
                    || PATH.id == id;
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
     * 获取方案名称
     *
     * @return name - 方案名称
     */
    public String getName() {
        return name;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /**
     * 设置方案名称
     *
     * @param name 方案名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取方案类型：1:基础方案,2:水龄方案,3:余氯方案,4:路径方案
     *
     * @return solution_type - 方案类型：1:基础方案,2:水龄方案,3:余氯方案,4:路径方案
     */
    public Integer getSolutionType() {
        return solutionType;
    }

    /**
     * 设置方案类型：1:基础方案,2:水龄方案,3:余氯方案,4:路径方案
     *
     * @param solutionType 方案类型：1:基础方案,2:水龄方案,3:余氯方案,4:路径方案
     */
    public void setSolutionType(Integer solutionType) {
        this.solutionType = solutionType;
    }

    /**
     * 获取流量单位
     * LPS（升/秒）
     * LPM（升/分）
     * MLD（兆升/日）
     * CMH（立方米/时）
     * CMD（立方米/日）
     */
    public String getFluxUnit() {
        return fluxUnit;
    }

    /**
     * 设置流量单位
     * LPS（升/秒）
     * LPM（升/分）
     * MLD（兆升/日）
     * CMH（立方米/时）
     * CMD（立方米/日）
     */
    public void setFluxUnit(String fluxUnit) {
        this.fluxUnit = fluxUnit;
    }

    /**
     * 计算水头损失使用的公式为：
     * HAZEN-WILLIAMS
     * DARCY-WEISBACH
     * CHEZY-MANNING
     */
    public String getLoss() {
        return loss;
    }

    /**
     * 计算水头损失使用的公式为：
     * HAZEN-WILLIAMS
     * DARCY-WEISBACH
     * CHEZY-MANNING
     */
    public void setLoss(String loss) {
        this.loss = loss;
    }

    /**
     * 获取最大试算次数
     *
     * @return calculate - 最大试算次数
     */
    public Integer getCalculate() {
        return calculate;
    }

    /**
     * 设置最大试算次数
     *
     * @param calculate 最大试算次数
     */
    public void setCalculate(Integer calculate) {
        this.calculate = calculate;
    }

    /**
     * 获取比重
     *
     * @return proportion - 比重
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    /**
     * 设置比重
     *
     * @param proportion 比重
     */
    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }

    /**
     * 获取相对粘度
     *
     * @return viscosity - 相对粘度
     */
    public BigDecimal getViscosity() {
        return viscosity;
    }

    /**
     * 设置相对粘度
     *
     * @param viscosity 相对粘度
     */
    public void setViscosity(BigDecimal viscosity) {
        this.viscosity = viscosity;
    }

    /**
     * 获取精度
     *
     * @return accuracy - 精度
     */
    public BigDecimal getAccuracy() {
        return accuracy;
    }

    /**
     * 设置精度
     *
     * @param accuracy 精度
     */
    public void setAccuracy(BigDecimal accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 获取缺省模式下时间模式ID标签
     *
     * @return default_mode_id - 缺省模式下时间模式ID标签
     */
    public String getDefaultModeId() {
        return defaultModeId;
    }

    /**
     * 设置缺省模式下时间模式ID标签
     *
     * @param defaultModeId 缺省模式下时间模式ID标签
     */
    public void setDefaultModeId(String defaultModeId) {
        this.defaultModeId = defaultModeId;
    }

    /**
     * 获取需水量乘子
     * 使得整个系统耗水量以固定的量变化，例如2.0为所有需水量的二倍，0.5则减半，1.0不变
     *
     * @return demand_rate - 需水量乘子
     * 使得整个系统耗水量以固定的量变化，例如2.0为所有需水量的二倍，0.5则减半，1.0不变
     */
    public BigDecimal getDemandRate() {
        return demandRate;
    }

    /**
     * 设置需水量乘子
     * 使得整个系统耗水量以固定的量变化，例如2.0为所有需水量的二倍，0.5则减半，1.0不变
     *
     * @param demandRate 需水量乘子
     *                   使得整个系统耗水量以固定的量变化，例如2.0为所有需水量的二倍，0.5则减半，1.0不变
     */
    public void setDemandRate(BigDecimal demandRate) {
        this.demandRate = demandRate;
    }

    /**
     * 获取射流点指数
     *
     * @return exponent - 射流点指数
     */
    public BigDecimal getExponent() {
        return exponent;
    }

    /**
     * 设置射流点指数
     *
     * @param exponent 射流点指数
     */
    public void setExponent(BigDecimal exponent) {
        this.exponent = exponent;
    }

    /**
     * 平衡度
     * 选择STOP:停止，停止在该点的模拟；或者CONTINUE:继续，
     * 使用另外10次试算
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 平衡度
     * 选择STOP:停止，停止在该点的模拟；或者CONTINUE:继续，
     * 使用另外10次试算
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * 状态报告
     * 在分析之后，报告状态信息的数量。选择为：
     * NO:否（没有状态报告）
     * YES:是（常规状态报告--列出模拟过程中所有管道状态的变化）
     * FULL:所有（完整报告—列出每一次水力分析试算，每一时段的常规报告加上收敛误差）
     * 完整状态报告仅仅用于调试。
     */
    public String getReport() {
        return report;
    }

    /**
     * 状态报告
     * 在分析之后，报告状态信息的数量。选择为：
     * NO:否（没有状态报告）
     * YES:是（常规状态报告--列出模拟过程中所有管道状态的变化）
     * FULL:所有（完整报告—列出每一次水力分析试算，每一时段的常规报告加上收敛误差）
     * 完整状态报告仅仅用于调试。
     */
    public void setReport(String report) {
        this.report = report;
    }

    /**
     * 获取简单控制
     *
     * @return simple_control - 简单控制
     */
    public String getSimpleControl() {
        return simpleControl;
    }

    /**
     * 设置简单控制
     *
     * @param simpleControl 简单控制
     */
    public void setSimpleControl(String simpleControl) {
        this.simpleControl = simpleControl;
    }

    /**
     * 获取规则控制
     *
     * @return rule_control - 规则控制
     */
    public String getRuleControl() {
        return ruleControl;
    }

    /**
     * 设置规则控制
     *
     * @param ruleControl 规则控制
     */
    public void setRuleControl(String ruleControl) {
        this.ruleControl = ruleControl;
    }

    /**
     * 获取最后模拟时间
     *
     * @return final_simulate_time - 最后模拟时间
     */
    public Date getFinalSimulateTime() {
        return finalSimulateTime;
    }

    /**
     * 设置最后模拟时间
     *
     * @param finalSimulateTime 最后模拟时间
     */
    public void setFinalSimulateTime(Date finalSimulateTime) {
        this.finalSimulateTime = finalSimulateTime;
    }

    /**
     * 获取运行状态(1:未执行,2:已执行)
     *
     * @return run_status - 运行状态(1:未执行,2:已执行)
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    /**
     * 设置运行状态(1:未执行,2:已执行)
     *
     * @param runStatus 运行状态(1:未执行,2:已执行)
     */
    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    /**
     * 获取默认方案：1-否，2-是
     *
     * @return default_scheme - 默认方案：1-否，2-是
     */
    public Integer getDefaultScheme() {
        return defaultScheme;
    }

    /**
     * 设置默认方案：1-否，2-是
     *
     * @param defaultScheme 默认方案：1-否，2-是
     */
    public void setDefaultScheme(Integer defaultScheme) {
        this.defaultScheme = defaultScheme;
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
        sb.append(", name=").append(name);
        sb.append(", solutionType=").append(solutionType);
        sb.append(", fluxUnit=").append(fluxUnit);
        sb.append(", loss=").append(loss);
        sb.append(", calculate=").append(calculate);
        sb.append(", proportion=").append(proportion);
        sb.append(", viscosity=").append(viscosity);
        sb.append(", accuracy=").append(accuracy);
        sb.append(", defaultModeId=").append(defaultModeId);
        sb.append(", demandRate=").append(demandRate);
        sb.append(", exponent=").append(exponent);
        sb.append(", balance=").append(balance);
        sb.append(", report=").append(report);
        sb.append(", simpleControl=").append(simpleControl);
        sb.append(", ruleControl=").append(ruleControl);
        sb.append(", finalSimulateTime=").append(finalSimulateTime);
        sb.append(", runStatus=").append(runStatus);
        sb.append(", defaultScheme=").append(defaultScheme);
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