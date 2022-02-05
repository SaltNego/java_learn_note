package com.itheima.variable;

public class VariableDemo2 {
    //    变量必须先声明再使用
//    变量声明后，不能再存储其他类型的数据
//    变量的有效范围从定义开始到}结束，在同一个范围内不能存在两个同名的变量
//        变量定义的时候可以没有初始值，但是使用的时候必须有初始值
    public static void main(String[] args) {
        char ch = 'a';
        // result:98
        System.out.println(ch+1);
        System.out.println(ch);


//        变量在计算机中低层原理
//        二进制
        int i1 = 0B0101000000101;
        System.out.println(i1);

//        八进制
        int i2 = 01411;
        System.out.println(i2);
//        十六进制
        int i3 = 0x43646f;
        System.out.println(i3);
    }
}
