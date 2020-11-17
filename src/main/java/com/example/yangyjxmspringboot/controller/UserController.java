package com.example.yangyjxmspringboot.controller;

import com.example.yangyjxmspringboot.entity.*;
import com.example.yangyjxmspringboot.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/2 15:25
 * @Description:
 */

@RestController
@RequestMapping("/system")
public class UserController {

    @Resource
    private UserService userService;

//    获取用户总数
    @RequestMapping("/getUserNumber")
    public Integer getUserNumber(){
        return userService.getUserNumber();
    }

//    新增用户
    @RequestMapping("/addNewUser")
    public void addNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

//    用户登录验证
    @RequestMapping("/login")
    public ResultInfo login(@RequestBody User user){
        ResultInfo<Map> resultInfo = new ResultInfo<Map>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("校验成功");
        resultInfo.setResultData(userService.login(user));
        return resultInfo;
    }

    //    查询代码表
    @PostMapping("/code")
    private ResultInfo<List<Code>> code(@RequestBody Code code){
        ResultInfo<List<Code>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(userService.code(code));
        return resultInfo;
    }

    //    删除代码表
    @RequestMapping("/deleteCode")
    private ResultInfo deleteCode (@RequestBody Code code){
        userService.deleteCode(code);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    //    新增代码表
    @RequestMapping("/addCode")
    private ResultInfo addCode (@RequestBody Code code){
        userService.addCode(code);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }
}