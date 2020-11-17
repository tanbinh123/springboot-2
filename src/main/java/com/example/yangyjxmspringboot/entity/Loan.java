package com.example.yangyjxmspringboot.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 杨雨佳
 * @Date: 2020/6/22 09:58
 * @Description:
 */
public class Loan {
    /**订单id**/
    private  Integer  loanId;

    /**贷款名称**/
    private  String  title;

    /**贷款详情**/
    private  String  details;

    /**订单状态：0-未完成，1-已完成，2-已删除，3-延期**/
    private  Integer  status;

    /**创建日期**/
    private Date createTime;

    /**完成时间**/
    private  Date completeTime;

    /**贷款名称**/
    private  String  createBy;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}