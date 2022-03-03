package com.itheima.param;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：理解引用类型的参数传递机制：值传递，区分其不同点
        int[] arrs = {10, 20, 30};
        change(arrs);
        System.out.println(arrs[1]);//222
    }

    public static void change(int[] arrs) {
        System.out.println(arrs[1]); //20
        arrs[1] = 222;
        System.out.println(arrs[1]); //222
    }
}