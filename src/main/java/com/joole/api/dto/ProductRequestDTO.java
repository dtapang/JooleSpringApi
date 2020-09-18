package com.joole.api.dto;

import javax.persistence.Column;
import java.sql.Date;

public class ProductRequestDTO {
    private String name;
    private String type;
    private Integer airflow;
    private Integer maxpower;
    private Date modelyear;
    private Integer soundmaxspeed;
    private Integer fansweepdiameter;
    private Integer height;
    private Integer firm;
    private Integer global;
    private String brand;
    private Date verified;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAirflow() {
        return airflow;
    }

    public void setAirflow(Integer airflow) {
        this.airflow = airflow;
    }

    public Integer getMaxpower() {
        return maxpower;
    }

    public void setMaxpower(Integer maxpower) {
        this.maxpower = maxpower;
    }

    public Date getModelyear() {
        return modelyear;
    }

    public void setModelyear(Date modelyear) {
        this.modelyear = modelyear;
    }

    public Integer getSoundmaxspeed() {
        return soundmaxspeed;
    }

    public void setSoundmaxspeed(Integer soundmaxspeed) {
        this.soundmaxspeed = soundmaxspeed;
    }

    public Integer getFansweepdiameter() {
        return fansweepdiameter;
    }

    public void setFansweepdiameter(Integer fansweepdiameter) {
        this.fansweepdiameter = fansweepdiameter;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getFirm() {
        return firm;
    }

    public void setFirm(Integer firm) {
        this.firm = firm;
    }

    public Integer getGlobal() {
        return global;
    }

    public void setGlobal(Integer global) {
        this.global = global;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getVerified() {
        return verified;
    }

    public void setVerified(Date verified) {
        this.verified = verified;
    }


}
