package com.bgmfeng.my.shop.commons.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author  : Tim Wang
 * @ FileName: SpringContext.java
 * @ Time    : 2020/7/4 20:12
 */
public final class SpringContext {

    public Object getBean(String beanId) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        return context.getBean(beanId);
    }
}
