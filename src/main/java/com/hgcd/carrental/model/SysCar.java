package com.hgcd.carrental.model;

import java.util.Date;

public class SysCar {
    private Integer id;

    private Integer carno;

    private String cartype;

    private String carbrand;

    private String models;

    private String carcolor;

    private Integer maxnum;

    private String km;

    private String lasttime;

    private String venhicle;

    private Date statustime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarno() {
        return carno;
    }

    public void setCarno(Integer carno) {
        this.carno = carno;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor == null ? null : carcolor.trim();
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km == null ? null : km.trim();
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime == null ? null : lasttime.trim();
    }

    public String getVenhicle() {
        return venhicle;
    }

    public void setVenhicle(String venhicle) {
        this.venhicle = venhicle == null ? null : venhicle.trim();
    }

    public Date getStatustime() {
        return statustime;
    }

    public void setStatustime(Date statustime) {
        this.statustime = statustime;
    }
}