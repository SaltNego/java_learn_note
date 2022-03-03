package com.itheima.traverse;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：学会进行数组元素的遍历
        int [] arr = {12, 24, 12, 48, 98};
        //             0   1   2   3   4

        //原始遍历方式
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //System.out.println(arr[3]);
        //System.out.println(arr[4]);
        //System.out.println(arr[5]);

        for (int i = 0; i < 5 ; i++) {
            System.out.println(arr[i]);
        }
        // 快捷键arr.fori
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }
}
