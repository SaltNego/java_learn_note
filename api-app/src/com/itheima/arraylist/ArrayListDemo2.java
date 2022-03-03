package com.itheima.arraylist;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 目标: 能够使用泛型约束ArrayList集合操作的数据类型
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();// JDK 1.7开始，泛型后面的类型申明可以不写
        list.add("JAVA");
        list.add("mysql");
//        list.add(23);
//        list.add(23.67);

        ArrayList<Integer> list2 = new ArrayList();// JDK 1.7开始，泛型后面的类型申明可以不写
        list2.add(23);
/*        list2.add(23.5);
        list2.add("java");*/

    }
}
