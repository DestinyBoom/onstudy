package com.xawl.study.model;

import java.util.Date;

public class Err_log {
    private String id;

    private Date insertTime;

    private String operUser;

    private String rsrv1;

    private String rsrv6;

    private String rsrv3;

    private String rsrv5;

    private String rsrv7;

    private String rsrv8;

    private String rsrv2;

    private String rsrv4;

    private String errInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser == null ? null : operUser.trim();
    }

    public String getRsrv1() {
        return rsrv1;
    }

    public void setRsrv1(String rsrv1) {
        this.rsrv1 = rsrv1 == null ? null : rsrv1.trim();
    }

    public String getRsrv6() {
        return rsrv6;
    }

    public void setRsrv6(String rsrv6) {
        this.rsrv6 = rsrv6 == null ? null : rsrv6.trim();
    }

    public String getRsrv3() {
        return rsrv3;
    }

    public void setRsrv3(String rsrv3) {
        this.rsrv3 = rsrv3 == null ? null : rsrv3.trim();
    }

    public String getRsrv5() {
        return rsrv5;
    }

    public void setRsrv5(String rsrv5) {
        this.rsrv5 = rsrv5 == null ? null : rsrv5.trim();
    }

    public String getRsrv7() {
        return rsrv7;
    }

    public void setRsrv7(String rsrv7) {
        this.rsrv7 = rsrv7 == null ? null : rsrv7.trim();
    }

    public String getRsrv8() {
        return rsrv8;
    }

    public void setRsrv8(String rsrv8) {
        this.rsrv8 = rsrv8 == null ? null : rsrv8.trim();
    }

    public String getRsrv2() {
        return rsrv2;
    }

    public void setRsrv2(String rsrv2) {
        this.rsrv2 = rsrv2 == null ? null : rsrv2.trim();
    }

    public String getRsrv4() {
        return rsrv4;
    }

    public void setRsrv4(String rsrv4) {
        this.rsrv4 = rsrv4 == null ? null : rsrv4.trim();
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo == null ? null : errInfo.trim();
    }
}