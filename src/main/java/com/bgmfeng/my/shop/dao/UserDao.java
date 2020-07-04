package com.bgmfeng.my.shop.dao;

import com.bgmfeng.my.shop.entity.User;

/**
 * @ Author  : Tim Wang
 * @ FileName: UserDao.java
 * @ Time    : 2020/7/4 18:59
 */
public interface UserDao {

    public User getUser(String email, String password);
}
