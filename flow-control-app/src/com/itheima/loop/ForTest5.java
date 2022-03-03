package com.itheima.loop;

/**
 * @author： Negoowen
 * @date： 2022-02-06
 * @project_name: java_learn_note
 */
public class ForTest5 {
    // 　篮球弹跳：篮球从十米的位置向下掉落，每一次掉落都是前一次的一半，问弹跳十次之后篮球篮球的高度
    public static void main(String[] args) {
        float h = 10;
        for (int i = 1; i <= 10; i++) {
            h = h / 2;
            String str = String.format("第%d次的高度为%f", i, h);
            System.out.println(str);
        }
    }
}


