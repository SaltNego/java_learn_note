package com.itheima.string;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */

import java.util.Scanner;

/**
 练习题：模拟用户登录
 */
public class StringExec7 {
    public static void main(String[] args) {
        // 1、定义正确的登录名称和密码
        String okLoginName = "admin";
        String okPassword = "itheima";

        // 2、定义一个循环，循环3次，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登录名称：");
            String loginName = sc.next();
            System.out.println("请您输入登录密码：");
            String password = sc.next();
            // 3、判断登录是否成功！
            if (okLoginName.equals(loginName)) {
                if (okPassword.equals(password)) {
                    System.out.println("login success~~~~");
                    break;
                } else {
                    System.out.println("Password error!");
                }
            } else {
                System.out.println("username error!");
            }
        }
    }
}
