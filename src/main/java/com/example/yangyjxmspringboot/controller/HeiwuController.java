package com.example.yangyjxmspringboot.controller;

import com.example.yangyjxmspringboot.entity.FunDreamMachine;
import com.example.yangyjxmspringboot.entity.ResultInfo;
import com.example.yangyjxmspringboot.entity.Suggestion;
import com.example.yangyjxmspringboot.service.HeiwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 杨雨佳
 * @Date: 2020/5/6 21:39
 * @Description:
 */

@RestController
@RequestMapping("/heiwu")
public class HeiwuController {

    @Autowired
    private HeiwuService heiwuService;

    //    新增趣味造梦机
    @RequestMapping("/addFunDreamMachine")
    private ResultInfo addFunDreamMachine (@RequestBody FunDreamMachine funDreamMachine){
        heiwuService.addFunDreamMachine(funDreamMachine);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    //    查询趣味造梦机
    @PostMapping("/queryFunDreamMachineList")
    private ResultInfo<List<FunDreamMachine>> queryList(@RequestBody FunDreamMachine funDreamMachine){
        ResultInfo<List<FunDreamMachine>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(heiwuService.queryFunDreamMachineList(funDreamMachine));
        return resultInfo;
    }

//    新增留言
    @RequestMapping("/addSuggestion")
    private ResultInfo addSuggestion (@RequestBody Suggestion suggestion){
        heiwuService.addSuggestion(suggestion);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

//    查询留言
    @PostMapping("/querySuggestionList")
    private ResultInfo<List<Suggestion>> querySuggestionList(@RequestBody Suggestion suggestion){
        ResultInfo<List<Suggestion>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(heiwuService.querySuggestionList(suggestion));
        return resultInfo;
    }
}