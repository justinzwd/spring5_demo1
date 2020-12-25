package com.atguigu.spring5.bean;

public class Dept
{
    private String deptName;

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    @Override
    public String toString()
    {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
