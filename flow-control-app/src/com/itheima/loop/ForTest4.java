package com.itheima.loop;

public class ForTest4 {

    public static void main(String[] args) {
        //需求：找出水仙花数并输出
        //在循环定义一个变量用于记录水仙花的个数
        // 1.定义一个for循环找出全部三位数
        //2.判断这个三位数是否满足要求
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //System.out.println(bai);
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum == i){
                count ++;
                System.out.println("找到啦！水仙数："+i);
            }
        }
        System.out.println("水仙花的个数是："+count);
    }
}
