package com.itheima.demo;

import java.util.Random;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class CaptchaCode {
    //定义方法实现随机产生一个位的验证码，每位可能是数字、大写字母、小写字母。
    public static void main(String[] args) {
        //4.调用获取验证码的方法得到一个随机的验证码
        String code = createCode(5);
        System.out.println("随机验证码:" + code);
    }

    /**
     * 1.定义一个方法返回一个随机验证码，是否需要返回值类型申明？ String    是否需要申明形参： int n
     */
    public static String createCode(int num) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < num; i++) {
            // i = 0 1 2 3 4
            //3.生成一个随机字符：英文大写  小写 数字（0  1  2 ）
            int type = r.nextInt(3); // 0  1  2
            switch (type) {
                case 0:
                    code += (char) (r.nextInt(26) + 65);
                    break;
                case 1:
                    code += (char) (r.nextInt(26) + 97);
                    break;
                case 2:
//                    code += (char) (r.nextInt(10) + 48);
                    code += r.nextInt(10) ;
                    break;
            }
        }
        return code;
    }

}
