package com.itheima.comstructor;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Car {


    String name;
    double price;

    //无参数构造器
    public Car() {
        System.out.println("无参数构造器被触发执行~~~");
    }

    public Car(String n, double p) {
        name = n;
        price = p;
        System.out.println("有参数构造器被触发执行~~~");

    }
}
