package com.example.yangyjxmspringboot.dao;

import com.example.yangyjxmspringboot.entity.Loan;
import com.example.yangyjxmspringboot.entity.Location;
import com.example.yangyjxmspringboot.entity.Treehole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeappMapper {

    //    新增树洞
    public Integer addTreehole(Treehole treehole);

    //    查询树洞
    public List<Treehole> queryTreeholeList(Treehole treehole);

    //    新增定位信息
    public Integer addLocation(Location location);

    //    统计定位信息
    public List<Map> countLocation();

    //    新增贷款
    public Integer addLoan(Loan loan);

    //    查询贷款
    public List<Loan> queryLoanList(Loan loan);

    //    删除贷款
    public Integer deleteLoan(Loan loan);

    //    更新贷款状态
    public Integer updateLoan(Loan loan);

    //    统计贷款状态数量
    public List<Integer> countLoan();

}
