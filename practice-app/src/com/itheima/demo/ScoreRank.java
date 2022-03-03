package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-09
 * @project_name: java_learn_note
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 需求:在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数
 * 选手的最后得分为：去掉最高分、最低分后4的评委的平均分，请完成上述过程并计算出选手的得分。
 */
public class ScoreRank {

    public static void main(String[] args) {

        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第" + ( i+ 1 ) + "个评委的打分：");
            scores[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(scores));

        //3.遍历数组中的每个数组，找出最大值  最小值 总分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
            //统计总分
            sum += scores[i];
        }

        //4.统计平均分即可
        double result = (sum - max - min) *1.0/ (scores.length - 2);
        System.out.println("选手最终得分是：" + result);

    }
}
