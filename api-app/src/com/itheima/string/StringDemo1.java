package com.itheima.string;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */

/**
 * 目标：了解string类的特点：string类不可变的原理。
 */


public class StringDemo1 {
    public static void main(String[] args) {
        String name = "传智";
        name += "教育"; //name = name +"教育"
        name += "中心";
        System.out.println(name);
    }
}