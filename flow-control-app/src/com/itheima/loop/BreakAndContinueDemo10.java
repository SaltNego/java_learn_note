package com.itheima.loop;

/**
 * @author： Negoowen
 * @date： 2022-02-06
 * @project_name: java_learn_note
 */
public class BreakAndContinueDemo10 {
    //目标：理解break 和 continue 的作用
    //场景：假如你又有老婆了，然后你犯错了，你老婆罚你做5天家务，每天都是洗碗，但是洗到第三天后心软了
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                System.out.println("Berak~");
                break;
            }else{
                System.out.println("正在洗碗~"+i);
            }

        }
        //continue 跳出当前循环的当次执行，进入循环的下一次
        //场景：假如你又有老婆了，然后你犯错了，你老婆罚你做5天家务。
        // 每天都是洗碗，但是洗碗到第三天后心软了 原谅你了不用洗了 但是依然不解恨 继续洗第4天 5天
        System.out.println("----------------");
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                System.out.println("Berak~");
                continue;
            }else{
                System.out.println("正在洗碗~"+i);
            }

        }
    }
}
