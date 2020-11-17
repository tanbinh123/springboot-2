package com.example.yangyjxmspringboot.entity;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/19 20:43
 * @Description: 封装消息返回的实体类
 */
public class ResultInfo<T extends Object> {
    private String resultCode;

    private T resultData;

    private String resultMsg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}