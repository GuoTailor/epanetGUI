package com.example.demo.model;


/**
 * @ClassName : OcStatus
 * @Description : [STATUS] 管段的初始状态 （管道和水泵、阀门）
 * @Author : yangzhiwei
 * @Date: 2021/3/25 10:46
 */

public class Status {

    private Long schemeId;
    /**
     * 管段ID标签
     */
    private String code;

    /**
     * 状态
     */
    private String initStatus;

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInitStatus() {
        return initStatus;
    }

    public void setInitStatus(String initStatus) {
        this.initStatus = initStatus;
    }
}
