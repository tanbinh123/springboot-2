package com.example.yangyjxmspringboot.service;

import com.example.yangyjxmspringboot.entity.Code;
import com.example.yangyjxmspringboot.entity.User;
import com.example.yangyjxmspringboot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/2 15:25
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //    获取用户总数
    public Integer getUserNumber() {
        return userMapper.getUserNumber();
    }

    //    新增用户
    public void addNewUser(User user){
        userMapper.addNewUser(user);
    }

    //    登录验证
    public Map login(User user){
        Map<String,Boolean> map = new HashMap<>();
        map.put("isPass",user.getPassword().equals(userMapper.login(user.getUser_name())));
        return map;
    }

    //    查询代码表
    public List<Code> code(Code code){
        return userMapper.code(code);
    };

    //    删除代码表
    public void deleteCode(Code code){
        userMapper.deleteCode(code);
    }

    //    新增代码表
    public void addCode(Code code){
        userMapper.addCode(code);
    }
}
