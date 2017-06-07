package com.xawl.study.model;

import java.util.Date;

public class Resource {
    private Integer id;

    private String resourcename;

    private String resume;

    private String src;

    private String showimagesrc;

    private Integer belongtointerestid;

    private Date uploadedate;

    private Integer resourcetype;

    private Byte okRead;

    private Byte type;

    private Integer likesum;

    private Integer aid;

    private Integer fid;

    private Integer cid;

    private Integer ordery;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename == null ? null : resourcename.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public String getShowimagesrc() {
        return showimagesrc;
    }

    public void setShowimagesrc(String showimagesrc) {
        this.showimagesrc = showimagesrc == null ? null : showimagesrc.trim();
    }

    public Integer getBelongtointerestid() {
        return belongtointerestid;
    }

    public void setBelongtointerestid(Integer belongtointerestid) {
        this.belongtointerestid = belongtointerestid;
    }

    public Date getUploadedate() {
        return uploadedate;
    }

    public void setUploadedate(Date uploadedate) {
        this.uploadedate = uploadedate;
    }

    public Integer getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(Integer resourcetype) {
        this.resourcetype = resourcetype;
    }

    public Byte getOkRead() {
        return okRead;
    }

    public void setOkRead(Byte okRead) {
        this.okRead = okRead;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getLikesum() {
        return likesum;
    }

    public void setLikesum(Integer likesum) {
        this.likesum = likesum;
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOrdery() {
        return ordery;
    }

    public void setOrdery(Integer ordery) {
        this.ordery = ordery;
    }
}