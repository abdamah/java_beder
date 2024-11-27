package com.riigsoft;

public class Swap {
    public void swap(){
        int a = 10;
        int b = 20;
        int tmp = 0;

        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Swap the values
        tmp = a;
        a  = b;
        b = tmp;
        System.out.println("After:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
