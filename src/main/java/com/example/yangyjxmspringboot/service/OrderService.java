package com.example.yangyjxmspringboot.service;

import com.example.yangyjxmspringboot.dao.OrderMapper;
import com.example.yangyjxmspringboot.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 杨雨佳
 * @Date: 2020/1/6 21:55
 * @Description:
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

//    新增订单
    public void addNewOrder(Order order){
        orderMapper.addNewOrder(order);
    }

    //    查询订单列表
    public List<Order> queryList(Order order){
        return orderMapper.queryList(order);
    };


}