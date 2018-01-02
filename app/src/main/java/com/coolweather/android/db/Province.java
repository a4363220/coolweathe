package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**
 * 这里是身份的实体类
 * */
public class Province extends DataSupport{
    // 省份 id
    private int id;
    // 省份 名字
    private String provinceName;
    // 省份 代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}