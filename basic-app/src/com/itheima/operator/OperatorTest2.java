package com.itheima.operator;

public class OperatorTest2 {
    //    对一个整数分别取出十位、百位、个位的数字
    public static void main(String[] args) {
        int data = 589;
        int ge = data % 10;
        System.out.println(ge);
        int shi = data / 10 %10;
        System.out.println(shi);
        int bai = data /100;
        System.out.println(bai);
    }
}
