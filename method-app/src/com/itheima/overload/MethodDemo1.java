package com.itheima.overload;

/**
 * @author： Negoowen
 * @date： 2022-02-08
 * @project_name: java_learn_note
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：识别方法重载的形式。并理解其调用流程，最后需要知道使用方法重载的好处
        fire();
        fire("岛国");
        fire("岛国", 1000);
    }

    public static void fire() {
//        System.out.println("发射一枚导弹给M国~");
        fire("M国");
    }

    public static void fire(String location) {
        System.out.println("发射一枚导弹给" + location + "国~");
//        fire("岛国",1);
    }

    public static void fire(String location, int num) {
        System.out.println("发射"+num+"枚导弹给" + location + "国~");
    }
}
