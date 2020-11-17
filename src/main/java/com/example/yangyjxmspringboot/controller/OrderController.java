package com.example.yangyjxmspringboot.controller;

import com.example.yangyjxmspringboot.entity.Order;
import com.example.yangyjxmspringboot.entity.ResultInfo;
import com.example.yangyjxmspringboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/6 21:39
 * @Description:
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //    新增订单
    @RequestMapping("/addNewOrder")
    private ResultInfo addNewOrder (@RequestBody Order order){
        ResultInfo resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("用户创建成功");
        return resultInfo;
    }

    //    查询订单
    @PostMapping("/queryList")
    private ResultInfo<List<Order>> queryList(@RequestBody Order order){
        ResultInfo<List<Order>> resultInfo = new ResultInfo<>();
        resultInfo.setResultCode("200");
        resultInfo.setResultMsg("查询成功");
        resultInfo.setResultData(orderService.queryList(order));
        return resultInfo;
    }
}