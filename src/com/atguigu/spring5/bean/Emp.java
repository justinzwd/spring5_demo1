package com.atguigu.spring5.bean;

public class Emp
{
    private String gender;
    private String name;

    private Dept dept;

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public Dept getDept()
    {
        return dept;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void add()
    {
        System.out.println(gender + "::" + name + "::" + dept);
    }
}
