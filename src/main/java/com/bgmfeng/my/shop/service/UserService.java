package com.bgmfeng.my.shop.service;

import com.bgmfeng.my.shop.entity.User;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserService.java
 * @ Time    : 2020/7/4 20:07
 */
public interface UserService  {

    public User login(String email, String password);
}
