package com.itheima.variable;

public class VariableDemo4 {
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        VariableDemo4 test = new VariableDemo4();
        test.pupAge();
    }
}
