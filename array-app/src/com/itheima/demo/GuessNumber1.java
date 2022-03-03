package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class GuessNumber1 {
    public static void main(String[] args) {
        //需求：5个1-20之间的随机数，让用户猜测，猜中要提示猜中，还要输出该数据在数组中第一次出现的索引，并打印数组的内容出来
        //没有猜中继续。

        //1.定义一个动态初始化的数组存储5个随机的1-20之间的数据
        int[] lucknum = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            lucknum[i] = r.nextInt(20) + 1;
        }
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("Please guess num: ");
            int guessnum = sc.nextInt();
            for (int i = 0; i < lucknum.length; i++) {
                if (lucknum[i] == guessnum) {
                    System.out.println("您已经猜中了该数据，运气不错!您猜中的数据索引是：" + i);
                    break OUT;
                }
            }
            System.out.println("当前猜测的数据在数组中不存在，请重新猜测！");

        }
        for (int item: lucknum) {
            System.out.print(item + "\t");
        }
    }
}
