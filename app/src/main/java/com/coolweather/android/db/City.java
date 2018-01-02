package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**
 * 这是市的实体类
 * */
public class City extends DataSupport{
    // 市id
    private int id;
    // 市名称
    private String cityName;
    // 市代号
    private int cityCode;
    // 所属省id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}