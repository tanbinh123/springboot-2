package com.example.yangyjxmspringboot.dao;

import com.example.yangyjxmspringboot.entity.Code;
import com.example.yangyjxmspringboot.entity.FunDreamMachine;
import com.example.yangyjxmspringboot.entity.Order;
import com.example.yangyjxmspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {

   User getUser();

   Integer getUserNumber();

   Integer addNewUser(User user);

   String login(String password);

   //    查询代码表
   public List<Code> code(Code code);

   //    删除代码表
   public void deleteCode(Code code);

   //    新增代码表
   public void addCode(Code code);
}
