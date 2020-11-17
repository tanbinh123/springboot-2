package com.example.yangyjxmspringboot.service;

import com.example.yangyjxmspringboot.dao.WeappMapper;
import com.example.yangyjxmspringboot.entity.Loan;
import com.example.yangyjxmspringboot.entity.Location;
import com.example.yangyjxmspringboot.entity.Treehole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 杨雨佳
 * @Date: 2020/6/22 10:01
 * @Description:
 */
@Service
public class WeappService {

    @Autowired
    private WeappMapper weappMapper;

    //    新增树洞
    public void addTreehole(Treehole treehole){
        weappMapper.addTreehole(treehole);
    }

    //    查询树洞
    public List<Treehole> queryTreeholeList(Treehole treehole){
        return weappMapper.queryTreeholeList(treehole);
    };

    //    新增定位信息
    public void addLocation(Location location){
        weappMapper.addLocation(location);
    }

    //    统计定位信息
    public List<Map> countLocation(){
        return weappMapper.countLocation();
    }

    //    新增贷款
    public void addLoan(Loan loan){
        weappMapper.addLoan(loan);
    }

    //    查询贷款
    public List<Loan> queryLoanList(Loan loan){
        return weappMapper.queryLoanList(loan);
    };

    //    删除贷款
    public void deleteLoan(Loan loan){
        weappMapper.deleteLoan(loan);
    }

    //    更新贷款状态
    public void updateLoan(Loan loan){
        weappMapper.updateLoan(loan);
    }

    //    统计贷款状态数量
    public List<Integer> countLoan(){
        return weappMapper.countLoan();
    }
}