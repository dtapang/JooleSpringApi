package com.joole.api.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "joole")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "type", nullable = true, length = 45)
    private String type;
    @Column(name = "airflow", nullable = true)
    private Integer airflow;
    @Column(name = "maxpower", nullable = true)
    private Integer maxpower;
    @Column(name = "modelyear", nullable = true)
    private Date modelyear;
    @Column(name = "soundmaxspeed", nullable = true)
    private Integer soundmaxspeed;
    @Column(name = "fansweepdiameter", nullable = true)
    private Integer fansweepdiameter;
    @Column(name = "height", nullable = true)
    private Integer height;
    @Column(name = "firm", nullable = true)
    private Integer firm;
    @Column(name = "global", nullable = true)
    private Integer global;
    @Column(name = "brand", nullable = true, length = 45)
    private String brand;
    @Column(name = "verified", nullable = true)
    private Date verified;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(type, product.type) &&
                Objects.equals(airflow, product.airflow) &&
                Objects.equals(maxpower, product.maxpower) &&
                Objects.equals(modelyear, product.modelyear) &&
                Objects.equals(soundmaxspeed, product.soundmaxspeed) &&
                Objects.equals(fansweepdiameter, product.fansweepdiameter) &&
                Objects.equals(height, product.height) &&
                Objects.equals(firm, product.firm) &&
                Objects.equals(global, product.global) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(verified, product.verified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, airflow, maxpower, modelyear, soundmaxspeed, fansweepdiameter, height, firm, global, brand, verified);
    }
}
