package com.example.api.service.impl;

import com.example.api.dao.UserMapper;
import com.example.api.entity.User;
import com.example.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Question-Api->UserServiceImpl
 * @description: 用户管理
 * @author: whLiu
 * @create: 2019-10-14 12:54
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserInformation(String username, String password) {
        return userMapper.selectUserByUsernameAndPassword(username, password);
    }
}
