package com.itheima.demo;

import java.awt.*;
import java.util.Scanner;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class Test2 {
    public static void main(String[] args) {
        //需求：判断一个整数是奇数还是偶数 并进行结果的输出 使用方法完成
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a num::: ");
        int num = sc.nextInt();
        System.out.println(odd(num));
    }

    public static String odd(int n) {
        if (n % 2 == 1) {
            return "这是一个奇数";
        }else{
            return "这是一个偶数";
        }
    }
}
