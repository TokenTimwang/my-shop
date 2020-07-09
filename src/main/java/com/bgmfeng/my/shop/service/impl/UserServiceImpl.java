package com.bgmfeng.my.shop.service.impl;

import com.bgmfeng.my.shop.commons.context.SpringContext;
import com.bgmfeng.my.shop.dao.UserDao;
import com.bgmfeng.my.shop.entity.User;
import com.bgmfeng.my.shop.service.UserService;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserServiceImpl.java
 * @ Time    : 2020/7/4 20:08
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = SpringContext.getBean("userDao");

    public User login(String email, String password) {
//        SpringContext springContext = new SpringContext();
//        UserDao userDao = (UserDao) springContext.getBean("userDao");
        return userDao.getUser(email, password);
    }
}
