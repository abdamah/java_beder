package com.riigsoft;

public class ATM {
    //vairable initalization
  private  double balance = 500.00;

  void checkBalance(){
      System.out.println("Your balance :$" + balance);
  }


  void greet(String name){
      System.out.println("Hi, " + name);
  }

  void deposit(double amount){
      balance = balance + amount;
      System.out.println("Your current balance :$" + balance);
  }






}
