package com.riigsoft;

import java.util.Scanner;

public class Calculator {
    public  void calculate(){
       while(true){
           int a, b;

           Scanner scanner = new Scanner(System.in);

           System.out.print("1.Add\n2.Sub\n3.Exit\n");

           System.out.print("Enter your choice: ");
           int choice = scanner.nextInt();

           switch(choice){
               case 1:
                   System.out.print("Enter a: ");
                   a = scanner.nextInt();

                   System.out.print("Enter b: ");
                   b = scanner.nextInt();

                   System.out.println(a + b);
                   break;
               case 2:
                   System.out.print("Enter a: ");
                   a = scanner.nextInt();

                   System.out.print("Enter b: ");
                   b = scanner.nextInt();

                   System.out.println(a - b);
                   break;
               case 3:
                   System.out.println("Thanks");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Invalid choice");
           }
       }
    }
}
