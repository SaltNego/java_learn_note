package com.itheima.string;

import java.util.Scanner;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class StringEqualsDemo4 {
    public static void main(String[] args) {
        // 1、正确登录名和密码
        String okName = "itheima";
        String okPassword = "123456";

        // 2、请您输入登录名称和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();

        // 3、判断用户输入的登录名称和密码与正确的内容是否相等。
//        双等于号是比较地址的，一个在常量池
        if (okName.equals(name) && okPassword.equals(password)) {
            System.out.println("login success~");
        } else {
            System.out.println("Errorrrrrrrrrrrrrrrrrrrrrrrrrr~");
        }
        // 4、忽略大小写比较内容的Api: 一般用于比较验证码这样的业务逻辑
        String sysCode = "23AdFh";
        String code1 = "23aDfH";
        System.out.println(sysCode.equals(code1)); // false
        System.out.println(sysCode.equalsIgnoreCase(code1)); // true


    }
}
