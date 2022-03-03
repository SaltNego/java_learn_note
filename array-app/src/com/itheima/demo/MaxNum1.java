package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class MaxNum1 {
    public static void main(String[] args) {
        //需求：数组元素求最值。
        //1.定义一个静态初始化的数组，存储一批颜值
        int [] faceScore = {15, 9000 , 10000 , 20000, 9500, -5};
        //                   0   1      2       3      4     5

        //2.定义一个变量用于存储最大值元素，建议使用第一个元素作为参照。
        int maxnum = faceScore[0];
        for (int i = 0; i < faceScore.length; i++) {
            if (faceScore[i]>maxnum){
                maxnum = faceScore[i];
            }
        }
        System.out.println("Max num::::" + maxnum);
        // 增强for循环
        for (int item : faceScore) {
            System.out.print(item + "\t");
        }
    }
}

