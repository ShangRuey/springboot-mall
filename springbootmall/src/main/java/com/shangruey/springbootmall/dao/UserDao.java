package com.shangruey.springbootmall.dao;

import com.shangruey.springbootmall.dto.UserRegisterRequest;
import com.shangruey.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

    User getUserById(Integer userId);
}
