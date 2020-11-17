package com.example.yangyjxmspringboot.dao;

import com.example.yangyjxmspringboot.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

//    新增订单
    public Integer addNewOrder(Order order);

//    查询订单列表
    public List<Order> queryList(Order order);
}
