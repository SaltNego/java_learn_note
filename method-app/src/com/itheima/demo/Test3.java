package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class Test3 {
    public static void main(String[] args) {
        //需求：使用方法，支持找出任意整型数组的最大值返回。
        int [] ages = {23, 19, 25, 78, 34};

        int maxnum = getArrayMax(ages);
        System.out.println(maxnum);
    }

    public static int getArrayMax(int[] arr) {
        //找出数组的最大值返回
        int max = arr[0];
        //遍历数组的每个元素与最大值的数据进行比较，若较大则替换
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
