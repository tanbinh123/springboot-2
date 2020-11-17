package com.example.yangyjxmspringboot.entity;

/**
 * @Author: 杨雨佳
 * @Date: 2020/5/9 16:06
 * @Description:
 */
public class FunDreamMachine {
    /**性别**/
    private  String  sex;

    /**年龄**/
    private  String  age;

    /**工作**/
    private String job;

    /**问题**/
    private  String  problem;

    /**奇思妙想**/
    private String other;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}