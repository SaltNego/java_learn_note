package com.itheima.JavaBean;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class User {
    //1.成员变量私有
    private String name;
    private double height;
    private double salary;

    //3.必须有无参数构造器（默认的）都用右键生成析构函数生成

    public User() {
    }


    //4.有参数构造器（不是必须的，可以选择）

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }


    //2.必须提供成套的gette 和 setter方法暴露成员变量的取值 和 赋值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
