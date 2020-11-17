package com.example.yangyjxmspringboot.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/4 15:06
 * @Description:
 */
public class Order {
    /**订单id**/
    private  Integer  purchaseId;

    /**订单号**/
    private  Integer  orderNo;

    /**实际支付金额，单位是元，保留两位小数**/
    private BigDecimal payment;

    /**订单状态：0-已取消，10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭**/
    private  Integer  status;

    /**快递单号**/
    private  String  expressNo;

    /**姓名**/
    private  String  name;

    /**电话**/
    private  String  phone;

    /**收货地址**/
    private  String  address;

    /**创建日期**/
    private Date createTime;

    /**支付日期**/
    private  Date  paymentTime;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}