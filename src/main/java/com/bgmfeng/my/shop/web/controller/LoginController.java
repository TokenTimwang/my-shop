package com.bgmfeng.my.shop.web.controller;

import com.bgmfeng.my.shop.commons.context.SpringContext;
import com.bgmfeng.my.shop.entity.User;
import com.bgmfeng.my.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Author  : Tim Wang
 * @ FileName: LoginController.java
 * @ Time    : 2020/7/4 20:18
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        SpringContext springContext = new SpringContext();
//        UserService userService = (UserService) springContext.getBean("userService");
//        User admin = userService.login("admin@gmail.com","admin");
//        System.out.println(admin);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        SpringContext springContext = new SpringContext();
        UserService userService = (UserService) springContext.getBean("userService");
        User admin = userService.login(email, password);

        if (admin != null ){
            resp.sendRedirect("/main.jsp");
        }else {
            req.setAttribute("message","用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }
}
