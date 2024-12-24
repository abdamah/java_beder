package com.riigsoft;

import java.util.Scanner;

public class Conditionals {
    public void conditions(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a:");
        int a  = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("A is greater than b");
        }else if (a < b){
            System.out.println("a is less than b");
        }else{
            System.out.println("a is equal b");
        }
    }
}
