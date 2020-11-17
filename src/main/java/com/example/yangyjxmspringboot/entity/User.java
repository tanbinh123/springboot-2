package com.example.yangyjxmspringboot.entity;

/**
 * @Author:杨雨佳
 * @Date: 2020/1/2 15:19
 * @Description:
 */
public class User {
    private Integer id;
    private String user_name;
    private String password;
    private String real_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", real_name='" + real_name + '\'' +
                '}';
    }
}