package com.itheima.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 1-10 的所有的奇数和
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1){
                sum += i;
                System.out.println(sum);
            }

        }
        System.out.println("------------");
        //1.定义循环找到 1 3 5 7 9
        int sum1 = 0;
        for (int j = 1; j <=10 ; j+=2) {
            // i = 1 3 5 7 9
            sum1 += j;
        }
        //3.输出求和变量即可
        System.out.println("1-10奇数和是：" + sum1);
    }
}
