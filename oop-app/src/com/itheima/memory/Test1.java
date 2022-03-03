package com.itheima.memory;

/**
 * @author： Negoowen
 * @date： 2022-02-10
 * @project_name: java_learn_note
 */
public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉、游戏";
        System.out.println(s1);
        s1.study();
        Student s2 = s1;
        s2.hobby = "爱提问";
        System.out.println(s2);
        s2.study();
        s1.study();



    }
}
