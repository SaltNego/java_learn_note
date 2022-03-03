package com.itheima.type;

public class TypeDemo2 {
    //    表达式的自动类型转换
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 1.01;
        double rs = a + b +c;
        System.out.println(rs);

//        面试题
        byte i = 10;
        byte j = 20;
        //byte k = i + j;
        int k = i + j;
        System.out.println(k);
    }
}
