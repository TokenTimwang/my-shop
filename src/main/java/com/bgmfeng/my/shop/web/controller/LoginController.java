package com.bgmfeng.my.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ Author  : Tim Wang
 * @ FileName: LoginController.java
 * @ Time    : 2020/7/4 20:18
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
