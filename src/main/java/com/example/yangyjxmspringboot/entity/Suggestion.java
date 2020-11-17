package com.example.yangyjxmspringboot.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 杨雨佳
 * @Date: 2020/5/8 18:06
 * @Description:
 */
public class Suggestion {
        /**客户姓名**/
        private  String  name;

        /**联系方式**/
        private  String  phone;

        /**订单号**/
        private String id;

        /**购买商品**/
        private  String  product;

        /**购买日期**/
        private String date;

        /**购买渠道**/
        private  String  way;

        /**建议**/
        private  String  suggestion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}