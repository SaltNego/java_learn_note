package com.itheima.createobject;

/**
 * @author： Negoowen
 * @date： 2022-02-10
 * @project_name: java_learn_note
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "奔驰GLC";
        c.price = 44.67;

        System.out.println(c.name);
        System.out.println(c.price);

        c.start();
        c.run();

        Car c2 = new Car();
        c2.name = "BMW";
        c2.price = 33.34;

        c2.start();
        c2.run();


    }


}
