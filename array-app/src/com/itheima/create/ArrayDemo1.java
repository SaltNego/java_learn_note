package com.itheima.create;

/**
 * @author： Negoowen
 * @date： 2022-02-07
 * @project_name: java_learn_note
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：学会使用静态初始化的方式定义数组
        //数据类型[] 数组名称 = new 数据类型[] {元素1，元素2.。。}
//        double[] array1 = new double[]{1, 2, 3, 4, 5, 6.5};
        double [] scores = {99.5,88.0,75.5};//简化写法

//        int[] ages = new int[]{12, 23, 24};
        int [] ages = {12, 24, 36}; //简化写法

//        String[] names = new String[]{"aaaaa", "aaaasasas", "sdfdsfsdf"};
        String [] name = {"牛二","全蛋儿","老王"};//简化写法

        System.out.println(name);

    }
}
