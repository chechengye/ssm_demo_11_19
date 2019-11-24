package com.weichuang.service.impl;

import com.weichuang.mapper.UserMapper;
import com.weichuang.pojo.User;
import com.weichuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public void registerUser(User user) {
        user.setUid(UUID.randomUUID().toString().replace("-",""));
        userMapper.registerUser(user);
    }

    @Override
    public User userLogin(String username, String password) {
        return userMapper.userLogin(username , password);
    }
}
