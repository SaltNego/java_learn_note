package com.itheima.create;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：学会动态初始化数组的定义和使用。
        double[] scores = new double[3];

        scores[0] = 9.5;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        String[] names = new String[90];
        names[0] = "迪丽热巴";
        names[2] = "古力娜扎";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
