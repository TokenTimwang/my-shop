package com.bgmfeng.my.shop.commons.context;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.DisposerRecord;

/**
 * @ Author  : Tim Wang
 * @ FileName: SpringContext.java
 * @ Time    : 2020/7/4 20:12
 */
public final class SpringContext implements ApplicationContextAware, DisposableBean {

    private static final Logger logger = LoggerFactory.getLogger(SpringContext.class);

    private static ApplicationContext applicationContext;

    public static <T> T getBean(String beanId) {
        assertContextInjected();
        return (T) applicationContext.getBean(beanId);
    }

    public static <T> T getBean(Class<T> clazz){
        assertContextInjected();
        return applicationContext.getBean(clazz);
    }

    public void destroy() throws Exception {
        logger.debug("清空 ApplicationContext");
        applicationContext = null;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.applicationContext = applicationContext;
    }

    public static void assertContextInjected() {
        Validate.validState(applicationContext == null, "你还没有spring-context.xml 中配置SpringContext对象");
    }
//     第一版本调用
//    public Object getBean(String beanId) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        return context.getBean(beanId);
//    }
//   第二版本调用

}
