package com.spring.learn.dao;

import com.spring.learn.model.User;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;
import java.util.List;


public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List <User> findAll()throws SQLException;


}
