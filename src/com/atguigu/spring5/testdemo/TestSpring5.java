package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.sax.SAXSource;

public class TestSpring5
{

    @Test
    public void testAdd()
    {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获得配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        System.out.println(orders.getOaddress());
        System.out.println(orders.getOname());
    }
}
