package com.itheima.create;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：学会访问数组的元素
        int [] ages = {12, 24, 36};
        //             0    1   2

        System.out.println(ages[2]);
        ages[2] = 555;

        System.out.println(ages.length);
        System.out.println(ages[2]);

        //int [] array = {}
        //System.out.println(arr.length -1);

        System.out.println(ages[0]);
    }
}
