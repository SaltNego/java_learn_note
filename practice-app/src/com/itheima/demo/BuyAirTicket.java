package com.itheima.demo;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */

import java.util.Scanner;

/**买飞机票
        需求：
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
*/

public class BuyAirTicket {
    public static void main(String[] args) {
        //3.录入购买信息，调用方法得到最终结果。
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价:");
        double price = sc.nextDouble();
        System.out.println("月份：");
        int month = sc.nextInt();
        System.out.println("仓位类型(头等舱、经济舱) :");
        String type = sc.next();

        double rs = calc(price, month , type);
        System.out.println("您当前购买机票的价格是：" + rs);

    }

    /*
   1.定义一个方法：形参（原价、月份、头等舱经济舱） 返回值类型申明：double
    */
    public static double calc(double money, int month, String type) {

        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的仓位不正确~~~");
                    money = -1; //当前无法计算价格了！
            }
        } else if (month >= 1 && month <= 4 || month == 11 || month == 12) {
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的仓位不正确~~~");
                    money = -1; //当前无法计算价格了！
            }
        }else {
            System.out.println("月份有问题");
            money = -1;
            return money;
        }
        return money;
    }


}
