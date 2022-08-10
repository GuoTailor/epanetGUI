package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class OcTime implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 方案id
     */
    private Long schemeId;

    /**
     * 总历时 格式 时:分
     */
    private String duration;

    /**
     * 水力时间步长 格式 时:分
     */
    private String hydraulicTimestep;

    /**
     * 水质步长  格式 时:分
     */
    private String qualityTimestep;

    /**
     * 模式步长   格式 时:分
     */
    private String patternTimestep;

    /**
     * 模式起始
     */
    private String patternStart;

    /**
     * 报告起始
     */
    private String reportStart;

    /**
     * 报告步长 格式 时:分
     */
    private String reportTimestep;

    /**
     * 钟表起始时间（12:00 AM） 格式  12:00 AM
     */
    private String startClocktime;

    /**
     * 总结延时模拟结果的统计过程类型。选项为：
     * NONE:无（每一报告时间步长中报告结果）
     * AVERAGE:平均（报告时间平均结果）
     * MINIMUM:最小（报告最小数值结果）
     * MAXIMUM:最大（报告最大数值结果）
     * RANGE:范围（报告最大和最小结果之间的差异）
     */
    private String statistics;

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
     * 获取总历时 格式 时:分
     *
     * @return duration - 总历时 格式 时:分
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置总历时 格式 时:分
     *
     * @param duration 总历时 格式 时:分
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 获取水力时间步长 格式 时:分
     *
     * @return hydraulic_timestep - 水力时间步长 格式 时:分
     */
    public String getHydraulicTimestep() {
        return hydraulicTimestep;
    }

    /**
     * 设置水力时间步长 格式 时:分
     *
     * @param hydraulicTimestep 水力时间步长 格式 时:分
     */
    public void setHydraulicTimestep(String hydraulicTimestep) {
        this.hydraulicTimestep = hydraulicTimestep;
    }

    /**
     * 获取水质步长  格式 时:分
     *
     * @return quality_timestep - 水质步长  格式 时:分
     */
    public String getQualityTimestep() {
        return qualityTimestep;
    }

    /**
     * 设置水质步长  格式 时:分
     *
     * @param qualityTimestep 水质步长  格式 时:分
     */
    public void setQualityTimestep(String qualityTimestep) {
        this.qualityTimestep = qualityTimestep;
    }

    /**
     * 获取模式步长   格式 时:分
     *
     * @return pattern_timestep - 模式步长   格式 时:分
     */
    public String getPatternTimestep() {
        return patternTimestep;
    }

    /**
     * 设置模式步长   格式 时:分
     *
     * @param patternTimestep 模式步长   格式 时:分
     */
    public void setPatternTimestep(String patternTimestep) {
        this.patternTimestep = patternTimestep;
    }

    /**
     * 获取模式起始
     *
     * @return pattern_start - 模式起始
     */
    public String getPatternStart() {
        return patternStart;
    }

    /**
     * 设置模式起始
     *
     * @param patternStart 模式起始
     */
    public void setPatternStart(String patternStart) {
        this.patternStart = patternStart;
    }

    /**
     * 获取报告起始
     *
     * @return report_start - 报告起始
     */
    public String getReportStart() {
        return reportStart;
    }

    /**
     * 设置报告起始
     *
     * @param reportStart 报告起始
     */
    public void setReportStart(String reportStart) {
        this.reportStart = reportStart;
    }

    /**
     * 获取报告步长
     *
     * @return report_timestep - 报告步长
     */
    public String getReportTimestep() {
        return reportTimestep;
    }

    /**
     * 设置报告步长
     *
     * @param reportTimestep 报告步长
     */
    public void setReportTimestep(String reportTimestep) {
        this.reportTimestep = reportTimestep;
    }

    /**
     * 获取钟表起始时间（3:00 PM）
     *
     * @return start_clocktime - 钟表起始时间（3:00 PM）
     */
    public String getStartClocktime() {
        return startClocktime;
    }

    /**
     * 设置钟表起始时间（3:00 PM）
     *
     * @param startClocktime 钟表起始时间（3:00 PM）
     */
    public void setStartClocktime(String startClocktime) {
        this.startClocktime = startClocktime;
    }

    /**
     * 总结延时模拟结果的统计过程类型。选项为：
     * NONE:无（每一报告时间步长中报告结果）
     * AVERAGE:平均（报告时间平均结果）
     * MINIMUM:最小（报告最小数值结果）
     * MAXIMUM:最大（报告最大数值结果）
     * RANGE:范围（报告最大和最小结果之间的差异）
     */
    public String getStatistics() {
        return statistics;
    }

    /**
     * 总结延时模拟结果的统计过程类型。选项为：
     * NONE:无（每一报告时间步长中报告结果）
     * AVERAGE:平均（报告时间平均结果）
     * MINIMUM:最小（报告最小数值结果）
     * MAXIMUM:最大（报告最大数值结果）
     * RANGE:范围（报告最大和最小结果之间的差异）
     */
    public void setStatistics(String statistics) {
        this.statistics = statistics;
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
        sb.append(", duration=").append(duration);
        sb.append(", hydraulicTimestep=").append(hydraulicTimestep);
        sb.append(", qualityTimestep=").append(qualityTimestep);
        sb.append(", patternTimestep=").append(patternTimestep);
        sb.append(", patternStart=").append(patternStart);
        sb.append(", reportStart=").append(reportStart);
        sb.append(", reportTimestep=").append(reportTimestep);
        sb.append(", startClocktime=").append(startClocktime);
        sb.append(", statistics=").append(statistics);
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