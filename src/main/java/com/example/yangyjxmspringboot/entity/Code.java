package com.example.yangyjxmspringboot.entity;

/**
 * @Author: 杨雨佳
 * @Date: 2020/5/11 09:34
 * @Description:
 */
public class Code {

    /**码值**/
    private  String  value;

    /**类型**/
    private  String  type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}