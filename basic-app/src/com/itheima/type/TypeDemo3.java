package com.itheima.type;

public class TypeDemo3 {
    //    强制类型转换使用
    public static void main(String[] args) {
        int a = 20;
//        报错
//        byte b = a;
        byte b = (byte)a;
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);

        double score = 99.956;
        int s = (int) score;
        System.out.println(s);//99
    }
}
