package com.riigsoft;

import java.util.Scanner;

public class Factorial {

    // for loog
    public  void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int result = 1;
        for(int i = 2; i <=n; i++){
            result  = result * i;
        }
        System.out.println("result: "+ result);
    }

    //while loop
    public void fact(){
   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
   int n = scanner.nextInt();

   int result = 1;
   while (n >=2){
       result = result * n;
       n--;
   }
        System.out.println("result: "+ result);
    }

}
