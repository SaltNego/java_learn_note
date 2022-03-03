package com.itheima.encapsulation;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Student {
    private int age;
    /**
     * 取值的方法：getAge
     */
    public int getAge() {
        return age;
    }
    /**
     * 赋值的方法：setAge
     */
    public void setAge(int age) {
        if (age >= 0 && age < 200) {
            this.age = age;
        } else {
            System.out.println("请检查年龄数值");
        }
    }

}
