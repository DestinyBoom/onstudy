package com.xawl.study.model;

import java.util.Date;

public class Course {
    private Integer cid;

    private String cname;

    private Date date;

    private Integer aid;

    private Integer fid;

    private String redesc;

    private Integer belongtointerestid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getRedesc() {
        return redesc;
    }

    public void setRedesc(String redesc) {
        this.redesc = redesc == null ? null : redesc.trim();
    }

    public Integer getBelongtointerestid() {
        return belongtointerestid;
    }

    public void setBelongtointerestid(Integer belongtointerestid) {
        this.belongtointerestid = belongtointerestid;
    }
}