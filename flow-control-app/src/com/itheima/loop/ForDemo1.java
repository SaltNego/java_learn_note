package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i< 3 ; i++){
            System.out.println("Hello world!");
            System.out.println(i);

        }

        System.out.println("--------------------");
        for (int i = 1; i< 5 ; i++){
            System.out.println("Hello world!");
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 1; i<= 5 ; i++){
            System.out.println("Hello world!");
            System.out.println(i);
        }

        System.out.println("--------------------");
        for (int i = 1; i< 5 ; i+=2){
            System.out.println("Hello world!");
            System.out.println(i);
        }
    }
}
