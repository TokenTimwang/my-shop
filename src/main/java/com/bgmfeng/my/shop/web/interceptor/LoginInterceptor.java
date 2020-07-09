package com.bgmfeng.my.shop.web.interceptor;

import com.bgmfeng.my.shop.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 登陆拦截器
 * @ Author  : Tim Wang
 * @ FileName: LoginInterceptor.java
 * @ Time    : 2020/7/8 0:08
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
         User user = (User) httpServletRequest.getSession().getAttribute("user");

         if (user == null){
             httpServletResponse.sendRedirect("/login");
         }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
