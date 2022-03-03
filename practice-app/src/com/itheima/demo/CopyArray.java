package com.itheima.demo;


/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class CopyArray {
    public static void main(String[] args) {
        int [] arr1 = {11, 22, 33, 44};
        //int[] arr2 = arr1; //没有完成了数组复制。
        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        System.out.println(arr1);
        printArray(arr1);
        System.out.println(arr2);
        printArray(arr2);
    }

    public static void copy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");

    }

}