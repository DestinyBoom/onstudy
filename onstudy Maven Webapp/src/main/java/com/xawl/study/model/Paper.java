package com.xawl.study.model;

import java.util.Date;

public class Paper {
    private Integer id;

    private Date joindate;

    private String papername;

    private Integer lengthtime;

    private Byte type;

    private Integer category;

    private Integer answeropen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Integer getLengthtime() {
        return lengthtime;
    }

    public void setLengthtime(Integer lengthtime) {
        this.lengthtime = lengthtime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getAnsweropen() {
        return answeropen;
    }

    public void setAnsweropen(Integer answeropen) {
        this.answeropen = answeropen;
    }
}