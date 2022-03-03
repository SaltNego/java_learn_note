package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
/*
需求：找出101-200之间的素数输出：
素数是什么：如果除了1 和它本身以外，不能被其他正整数整除，叫做素数。
 */
public class FindPrimeNum {
    public static void main(String[] args) {
        //1.定义一个循环，找到101-200之间的全部数据

        for (int i = 101; i <= 200; i++) {
            // i = 101 102 103 ... 199 200

            boolean flag = true;   //  一开始认为当前数据是素数.
            //2.判断当前遍历的这个数据是否是素数
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            //3.根据判定的结果选择是否输出这个数据，是素数则输出
            if (flag) {
                System.out.println("sushu:"+i);
            }

        }
    }
}
