package com.itheima.attention;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class Test1 {
    public static void main(String[] args) {
        int [] arr = {11,22,33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //System.out.println(arr[3]); //出现异常

        arr = null;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println("程序结束。。。");

    }

}
