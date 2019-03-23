package com.ecps.seckill.pojo;

import java.util.Date;

public class TFreightArea {
    private Integer id;

    private Integer fTempletid;

    private String pid;

    private String p;

    private Integer firstcount;

    private Double firstFreight;

    private Integer continuation;

    private Double continueFreight;

    private Integer creater;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getfTempletid() {
        return fTempletid;
    }

    public void setfTempletid(Integer fTempletid) {
        this.fTempletid = fTempletid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p == null ? null : p.trim();
    }

    public Integer getFirstcount() {
        return firstcount;
    }

    public void setFirstcount(Integer firstcount) {
        this.firstcount = firstcount;
    }

    public Double getFirstFreight() {
        return firstFreight;
    }

    public void setFirstFreight(Double firstFreight) {
        this.firstFreight = firstFreight;
    }

    public Integer getContinuation() {
        return continuation;
    }

    public void setContinuation(Integer continuation) {
        this.continuation = continuation;
    }

    public Double getContinueFreight() {
        return continueFreight;
    }

    public void setContinueFreight(Double continueFreight) {
        this.continueFreight = continueFreight;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}