package com.weichuang.mapper;

import com.weichuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserMapper {

    void registerUser(User user);

    User userLogin(@Param(value = "username") String username, @Param(value = "password") String password);
}
