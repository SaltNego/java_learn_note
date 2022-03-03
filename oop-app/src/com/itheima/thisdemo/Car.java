package com.itheima.thisdemo;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Car {

    String name;
    double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public  void goWith(String name){
        System.out.println(this.name+" and "+ name +" goWith~~~");
    }
}
