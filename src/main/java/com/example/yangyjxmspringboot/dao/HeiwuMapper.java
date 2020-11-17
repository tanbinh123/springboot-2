package com.example.yangyjxmspringboot.dao;

import com.example.yangyjxmspringboot.entity.FunDreamMachine;
import com.example.yangyjxmspringboot.entity.Suggestion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HeiwuMapper {

    //    新增趣味造梦机
    public Integer addFunDreamMachine(FunDreamMachine funDreamMachine);

    //    查询趣味造梦机
    public List<FunDreamMachine> queryFunDreamMachineList(FunDreamMachine funDreamMachine);

    //    新增留言
    public Integer addSuggestion(Suggestion suggestion);

    //    查询留言
    public List<Suggestion> querySuggestionList(Suggestion suggestion);

}
