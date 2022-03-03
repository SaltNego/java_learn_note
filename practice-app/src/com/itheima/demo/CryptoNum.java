package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-09
 * @project_name: java_learn_note
 */

import java.util.Arrays;

/**
 * 需求：某系统的数字密码，比如1983，采用加密方式进行传输，规划如下：先得到每位数，然后每位数都加上5再对10求余
 * 最后将所有数字反转，得到一串新数。
 */
public class CryptoNum {

    public static void main(String[] args) {
        //1.定义一个数组存储需要加密的数据
        int [] arr = new int[] {1, 9, 8, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            temp = (arr[i] + 5) % 10;
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            int temp = 0;
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
