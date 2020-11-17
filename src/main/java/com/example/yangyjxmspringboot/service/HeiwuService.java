package com.example.yangyjxmspringboot.service;

import com.example.yangyjxmspringboot.dao.HeiwuMapper;
import com.example.yangyjxmspringboot.entity.FunDreamMachine;
import com.example.yangyjxmspringboot.entity.Suggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/6 21:55
 * @Description:
 */
@Service
public class HeiwuService {

    @Autowired
    private HeiwuMapper heiwuMapper;

    //    新增趣味造梦机
    public void addFunDreamMachine(FunDreamMachine funDreamMachine){
        heiwuMapper.addFunDreamMachine(funDreamMachine);
    }

    //    查询趣味造梦机
    public List<FunDreamMachine> queryFunDreamMachineList(FunDreamMachine funDreamMachine){
        return heiwuMapper.queryFunDreamMachineList(funDreamMachine);
    };

    //    新增留言
    public void addSuggestion(Suggestion suggestion){
        heiwuMapper.addSuggestion(suggestion);
    }

    //    查询留言列表
    public List<Suggestion> querySuggestionList(Suggestion suggestion){
        return heiwuMapper.querySuggestionList(suggestion);
    };


}