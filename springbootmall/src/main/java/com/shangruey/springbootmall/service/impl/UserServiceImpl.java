package com.shangruey.springbootmall.service.impl;

import com.shangruey.springbootmall.dao.UserDao;
import com.shangruey.springbootmall.dto.UserRegisterRequest;
import com.shangruey.springbootmall.model.User;
import com.shangruey.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {
    //log變數
    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        //檢查註冊的 email
        User user=userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user !=null){
            log.warn("該 email {} 已經被註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        // 創建帳號
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
