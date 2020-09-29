package com.joole.api.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String manufacturer;
    private String series;
    private String model;
    private Date vDate;
    private String uType;
    private String application;
    private String mLocation;
    private String accessories;
    private Integer modelYear;
    private Integer airflow;
    private BigDecimal powerMin;
    private BigDecimal powerMax;
    private BigDecimal oVoltageMin;
    private BigDecimal fanSpeedMax;
    private Integer firm;
    private Integer global;
    private Integer fanSpeeds;
    private Integer maxSpeedSound;
    private Integer diameter;
    private Integer weight;
    private BigDecimal heightMin;
    private Integer heightMax;
    private String imageSrc;
    private String category;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "manufacturer", nullable = false, length = 12)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "series", nullable = false, length = 22)
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 22)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "vdate", nullable = false)
    public Date getvDate() {
        return vDate;
    }

    public void setvDate(Date vDate) {
        this.vDate = vDate;
    }

    @Basic
    @Column(name = "utype", nullable = false, length = 10)
    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    @Basic
    @Column(name = "application", nullable = false, length = 6)
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Basic
    @Column(name = "mlocation", nullable = false, length = 4)
    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    @Basic
    @Column(name = "accessories", nullable = false, length = 10)
    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Basic
    @Column(name = "modelyear", nullable = false)
    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    @Basic
    @Column(name = "airflow", nullable = false)
    public Integer getAirflow() {
        return airflow;
    }

    public void setAirflow(Integer airflow) {
        this.airflow = airflow;
    }

    @Basic
    @Column(name = "powermin", nullable = false, precision = 2)
    public BigDecimal getPowerMin() {
        return powerMin;
    }

    public void setPowerMin(BigDecimal powerMin) {
        this.powerMin = powerMin;
    }

    @Basic
    @Column(name = "powermax", nullable = false, precision = 2)
    public BigDecimal getPowerMax() {
        return powerMax;
    }

    public void setPowerMax(BigDecimal powerMax) {
        this.powerMax = powerMax;
    }

    @Basic
    @Column(name = "ovoltagemin", nullable = false, precision = 2)
    public BigDecimal getoVoltageMin() {
        return oVoltageMin;
    }

    public void setoVoltageMin(BigDecimal oVoltageMin) {
        this.oVoltageMin = oVoltageMin;
    }

    @Basic
    @Column(name = "fansm", nullable = false, precision = 2)
    public BigDecimal getFanSpeedMax() {
        return fanSpeedMax;
    }

    public void setFanSpeedMax(BigDecimal fanSpeedMax) {
        this.fanSpeedMax = fanSpeedMax;
    }

    @Basic
    @Column(name = "firm", nullable = false)
    public Integer getFirm() {
        return firm;
    }

    public void setFirm(Integer firm) {
        this.firm = firm;
    }

    @Basic
    @Column(name = "global", nullable = false)
    public Integer getGlobal() {
        return global;
    }

    public void setGlobal(Integer global) {
        this.global = global;
    }

    @Basic
    @Column(name = "fanspeeds", nullable = false)
    public Integer getFanSpeeds() {
        return fanSpeeds;
    }

    public void setFanSpeeds(Integer fanSpeeds) {
        this.fanSpeeds = fanSpeeds;
    }

    @Basic
    @Column(name = "maxspeedsound", nullable = false)
    public Integer getMaxSpeedSound() {
        return maxSpeedSound;
    }

    public void setMaxSpeedSound(Integer maxSpeedSound) {
        this.maxSpeedSound = maxSpeedSound;
    }

    @Basic
    @Column(name = "diameter", nullable = false)
    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    @Basic
    @Column(name = "weight", nullable = false)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "heightmin", nullable = false, precision = 1)
    public BigDecimal getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(BigDecimal heightMin) {
        this.heightMin = heightMin;
    }

    @Basic
    @Column(name = "heightmax", nullable = false)
    public Integer getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(Integer heightMax) {
        this.heightMax = heightMax;
    }

    @Basic
    @Column(name = "imagesrc", nullable = false, length = 4)
    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 50)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(manufacturer, product.manufacturer) &&
                Objects.equals(series, product.series) &&
                Objects.equals(model, product.model) &&
                Objects.equals(vDate, product.vDate) &&
                Objects.equals(uType, product.uType) &&
                Objects.equals(application, product.application) &&
                Objects.equals(mLocation, product.mLocation) &&
                Objects.equals(accessories, product.accessories) &&
                Objects.equals(modelYear, product.modelYear) &&
                Objects.equals(airflow, product.airflow) &&
                Objects.equals(powerMin, product.powerMin) &&
                Objects.equals(powerMax, product.powerMax) &&
                Objects.equals(oVoltageMin, product.oVoltageMin) &&
                Objects.equals(fanSpeedMax, product.fanSpeedMax) &&
                Objects.equals(firm, product.firm) &&
                Objects.equals(global, product.global) &&
                Objects.equals(fanSpeeds, product.fanSpeeds) &&
                Objects.equals(maxSpeedSound, product.maxSpeedSound) &&
                Objects.equals(diameter, product.diameter) &&
                Objects.equals(weight, product.weight) &&
                Objects.equals(heightMin, product.heightMin) &&
                Objects.equals(heightMax, product.heightMax) &&
                Objects.equals(imageSrc, product.imageSrc) &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, series, model, vDate, uType, application, mLocation, accessories, modelYear, airflow, powerMin, powerMax, oVoltageMin, fanSpeedMax, firm, global, fanSpeeds, maxSpeedSound, diameter, weight, heightMin, heightMax, imageSrc, category);
    }
}
