package com.hgcd.carrental.model;

import java.math.BigDecimal;

public class BizFee {
    private Integer id;

    private Integer bizid;

    private String km;

    private BigDecimal price;

    private String parking;

    private String tollfee;

    private String fee;

    private String sumfee;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBizid() {
        return bizid;
    }

    public void setBizid(Integer bizid) {
        this.bizid = bizid;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km == null ? null : km.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking == null ? null : parking.trim();
    }

    public String getTollfee() {
        return tollfee;
    }

    public void setTollfee(String tollfee) {
        this.tollfee = tollfee == null ? null : tollfee.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getSumfee() {
        return sumfee;
    }

    public void setSumfee(String sumfee) {
        this.sumfee = sumfee == null ? null : sumfee.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}