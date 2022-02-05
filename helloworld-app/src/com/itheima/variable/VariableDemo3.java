package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
//        目标账务使用基本数据类型定义变量
//        1、byte类型 -128-127

        byte number = 126;
        System.out.println(number);
//        short类型 短整数占用两个字节，
//        int 类型 默认的类型 占用四个字节；
//        long长类型，后面加L
        long i3 = 2123123;
        long i4 = 2134243423432422341L;
        System.out.println(i3);
        System.out.println(i4);
//        浮点类型后面加F
        float i5 = 3.1414F;
        System.out.println(i5);

        boolean i6 = false;
        System.out.println(i6);
        System.out.println("------------------------------------------");

        String i7 = "我爱中国";
        System.out.println(i7);

    }
}
