package com.itheima.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * @author： Negoowen
 * @date： 2022-02-06
 * @project_name: java_learn_note
 */
public class RandomNumber2 {
    //需求：随机生成一个1-100之间的数据，然后使用死循环让用户不断的猜测
    //1.得到一个1-100之间的随机数 (0-99)+1
    public static void main(String[] args) {
        Random r = new Random();
        int lucknum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please input a num(1-100): ");
            int input_num = sc.nextInt();
            if (input_num == lucknum){
                System.out.println("You Win!!! num is :" + lucknum);
                break;
            }else if(input_num<lucknum){
                System.out.println("Your num is too small!!!");
            }else{
                System.out.println("Your num is too large!!!");
            }
        }
    }
}
