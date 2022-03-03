package com.itheima.create;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int rs = add(100, 200);
        System.out.println(rs);
    }

    public static int add(int a,int b) {
        int c = a + b;
        return c;
    }
}
