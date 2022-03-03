package com.itheima.encapsulation;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Test1 {
    public static void main(String[] args) {

        Student s = new Student();
//        s.age = -23;
//        System.out.println(s.age);
        System.out.println(s.getAge());
        s.setAge(30);
        System.out.println(s.getAge());
    }

}
