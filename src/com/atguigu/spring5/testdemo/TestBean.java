package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean
{
    @Test
    public void testBean()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.add();

    }
}
