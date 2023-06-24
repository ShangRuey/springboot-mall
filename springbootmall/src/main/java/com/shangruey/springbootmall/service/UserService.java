package com.shangruey.springbootmall.service;

import com.shangruey.springbootmall.dto.UserRegisterRequest;
import com.shangruey.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
