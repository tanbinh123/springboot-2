package com.example.yangyjxmspringboot.entity;

import java.util.Date;

/**
 * @Author: 杨雨佳
 * @Date: 2020/7/3 14:24
 * @Description:
 */
public class Location {
    /**id**/
    private  Integer  id;

    /**国家名称**/
    private  String  country;

    /**省份名称**/
    private  String  province;

    /**城市名称**/
    private  String  city;

    /**地址**/
    private  String  address;

    /**日期**/
    private Date date;

    /**定位人**/
    private  String  user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}