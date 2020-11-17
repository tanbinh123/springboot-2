package com.example.yangyjxmspringboot.entity;

import java.util.Date;

/**
 * @Author: 杨雨佳
 * @Date: 2020/7/9 10:38
 * @Description:
 */
public class Treehole {
    private  Integer  id;

    private  String  userid;

    private  String  contentType;

    private  String  content;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}