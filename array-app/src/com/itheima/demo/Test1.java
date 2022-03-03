package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class Test1 {
    //需求：数组元素求和
    //1.把这些数据拿到程序中使用数组
    public static void main(String[] args) {
        int[] money = {16, 26, 25, 45, 56, 58};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
            System.out.println(sum);
        }

    }
}
