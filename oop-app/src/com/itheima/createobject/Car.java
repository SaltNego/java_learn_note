package com.itheima.createobject;

/**
 * @author： Negoowen
 * @date： 2022-02-10
 * @project_name: java_learn_note
 */
public class Car {
    //成员变量（属性）
    String name;
    double price;

    //方法（行为）
    public void start() {
        System.out.println(name + "，价格是：" + price + "，启动了");
    }

    public void run() {
        System.out.println(name + "，价格是：" + price + "，加速了");
    }

}

