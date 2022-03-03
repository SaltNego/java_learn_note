package com.itheima.loop;

/**
 * @author： Negoowen
 * @date： 2022-02-06
 * @project_name: java_learn_note
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰高度是8848860 纸张厚度 0.1 折叠纸张直到不低于珠穆朗峰位置，求折叠次数
        //1.定义变量记录山峰的高度  纸张的厚度
        int heigth = 8848860;
        double paper = 0.1;
        int number = 0;
        while (paper<heigth){
            paper *= 2;
            number++;
            String str = String.format("第%d次的高度为:%f", number, paper);
            System.out.println(str);
        }
        System.out.println("折叠纸张直到不低于珠穆朗峰位置，求折叠次数是：" + number);

    }
}
