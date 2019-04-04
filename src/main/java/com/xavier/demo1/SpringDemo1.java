package com.xavier.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
    @Test
    public void demo1() {
        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao) new MyJDKProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();

        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // userDao.save();
    }
}
