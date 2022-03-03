package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        目标学会使用键盘录入技术
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input age:");
        int age = sc.nextInt();
        System.out.println("Age is : " +age);

        System.out.println("Please input name:");
        String name = sc.next();
        System.out.println("Name is " + name);
        System.out.println("Welcome "+ name +"! Your age is " + age);


    }
}
