package com.spring.learn.service;

import com.spring.learn.dao.UserMapper;
import com.spring.learn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by baiguantao on 2017/5/22.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(String id){
       return  userMapper.selectByPrimaryKey(id);
    }

    public void insert(User user){

        userMapper.insert(user);
    }

    public List <User> findAll() throws SQLException {
        return userMapper.findAll();
    }
}
