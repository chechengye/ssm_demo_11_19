package com.weichuang.service;

import com.weichuang.pojo.User;

public interface UserService {

    void registerUser(User user);

    User userLogin(String username, String password);
}
