package com.tejadvv.weather_api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Weather {
    @Id
    @Column
    private Integer id;
    @Column
    private Date date;
    @Column
    private Double lat;
    @Column
    private Double lon;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private Double temp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
