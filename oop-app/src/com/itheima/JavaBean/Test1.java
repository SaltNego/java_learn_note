package com.itheima.JavaBean;

/**
 * @author： Negoowen
 * @date： 2022-02-11
 * @project_name: java_learn_note
 */
public class Test1 {
    public static void main(String[] args) {
        User u = new User();
        u.setName("吴彦祖");
        u.setHeight(185.5);
        u.setSalary(1000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        //2.调用有参数构造器创建对象
        User u2 = new User("关之琳",169.5,500);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());

    }
}
