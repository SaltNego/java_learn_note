package com.itheima.param;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class Test5 {
    public static void main(String[] args) {
        //需求：比较任意2个整型数组的内容是否一样，一样返回true 反之
        int[] arr1= {10, 20, 31};
        int[] arr2= {10, 20, 30};
        System.out.println(compare(arr1,arr2));
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        //2.判断2个数组的内容是一样的呢
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
