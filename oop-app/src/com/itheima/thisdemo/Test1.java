package com.itheima.thisdemo;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("宝马x5", 459000);
        System.out.println(c1.name);
        System.out.println(c1.price);

        c1.goWith("奔驰");
    }

}
