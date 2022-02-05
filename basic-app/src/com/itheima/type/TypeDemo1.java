package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
//        目标：学习自动类型转换
        System.out.println("asasas");
        byte a = 20;
        // 发生自动类型转换
        int b = a;
        System.out.println(b);

        int c = 23;
        double d = c;
        System.out.println("c="+c);
        System.out.println(c);

        char ch = 'a';
        int code = ch;
        System.out.println(code);


    }
}
