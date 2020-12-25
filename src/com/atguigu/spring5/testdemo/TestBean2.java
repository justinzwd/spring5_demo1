package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean2
{
    @Test
    public void testAdd()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = (Emp)context.getBean("emp",Emp.class);

        emp.add();
    }

    @Test
    public void testAdd2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = (Emp)context.getBean("emp",Emp.class);

        emp.add();
    }
}
