package com.example.yangyjxmspringboot.controller;

import com.example.yangyjxmspringboot.entity.*;
import com.example.yangyjxmspringboot.service.WeappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * @Author: 杨雨佳
 * @Date: 2020/6/22 09:58
 * @Description: 微信小程序「小亚银行」专用
 */

@RestController
@RequestMapping("/weapp")
public class WeappController {

    @Autowired
    private WeappService weappService;

    // 新增树洞
    @RequestMapping("/addTreehole")
    private ResultInfo addTreehole (@RequestBody Treehole treehole){
        weappService.addTreehole(treehole);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    // 查询树洞
    @GetMapping("/queryTreeholeList")
    private List<Treehole> queryTreeholeList(Treehole treehole){
        return weappService.queryTreeholeList(treehole);
    }

    // 新增定位信息
    @RequestMapping("/addLocation")
    private ResultInfo addLocation (@RequestBody Location location){
        weappService.addLocation(location);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    // 查询定位信息
    @GetMapping("/countLocation")
    private List<Map> countLocation(){
        return weappService.countLocation();
    }

    // 新增贷款
    @RequestMapping("/addLoan")
    private ResultInfo addLoan (@RequestBody Loan loan){
        weappService.addLoan(loan);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    // 查询贷款
    @PostMapping("/queryLoanList")
    private ResultInfo<List<Loan>> queryLoanList(@RequestBody Loan loan){
        ResultInfo<List<Loan>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(weappService.queryLoanList(loan));
        return resultInfo;
    }

    // 删除贷款
    @PostMapping("/deleteLoan")
    private ResultInfo deleteLoan (@RequestBody Loan loan){
        weappService.deleteLoan(loan);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    // 更新贷款状态
    @PostMapping("/updateLoan")
    private ResultInfo updateLoan (@RequestBody Loan loan){
        weappService.updateLoan(loan);
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("提交成功");
        return resultInfo;
    }

    // 查询贷款
    @GetMapping("/countLoan")
    private ResultInfo<List<Integer>> countLoan(){
        ResultInfo<List<Integer>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(weappService.countLoan());
        return resultInfo;
    }
}