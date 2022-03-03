package com.itheima.loop;

import java.util.Random;

/**
 * @author： Negoowen
 * @date： 2022-02-06
 * @project_name: java_learn_note
 */
public class RandomDemo1 {
    //目标：学会使用java提供的随机数类Random
    //1.导包
    //2.创建随机数对象
    public static void main(String[] args) {

        Random r = new Random();
        for(int j =1;j < 5; j++) {
            int i = r.nextInt(10);
            System.out.println("Random number is : " + i);
        }
        System.out.println("---------------");

        //	nextInt(int bound)
        //返回从该随机数生成器的序列中提取的伪随机，均匀分布的值在0（包括）和指定值（不包括）之间的 int 。
        // 生成1-10之间的随机数的方法
        // 1-10 ==》 -1 ==》 （0-9）+1
        int data = r.nextInt(10) + 1;
        System.out.println("生成1-10之间的随机:" + data);

        // 3-17 ==> -3 ==> (0-14)+3
        int data1 = r.nextInt(14) + 3;
        System.out.println("生成3-17之间的随机:" + data1);
    }
}
