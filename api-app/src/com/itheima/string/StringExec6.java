package com.itheima.string;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Random;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class StringExec6 {
    public static void main(String[] args) {
        // 1、定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // 2、循环5次，每次生成一个随机的索引，提取对应的字符连接起来即可
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }
        System.out.println(code);

    }
}
