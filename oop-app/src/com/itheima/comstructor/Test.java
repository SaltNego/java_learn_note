package com.itheima.comstructor;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Test {
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println(c.name);

        Car c2 = new Car("奔驰", 334400);
        System.out.println(c2.name+c2.price);
    }


}
