package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1、创建ArrayList集合的对象
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("黑马");
        list.add(23);
        list.add(23.5);
        list.add(false);
        System.out.println(list.add('中'));
        System.out.println(list);

        // 3、给指定索引位置插入元素\
        list.add(1,"zhaomin");
        System.out.println(list);


    }
}
