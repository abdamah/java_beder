package com.riigsoft;


public class Main {


    public static void main(String[] args) {
//       DataTypes dt = new DataTypes();
//        dt.dataTypes();
//        Operators op = new Operators();
//        op.operators();
//        Swap s = new Swap();
//        s.swap();
//
//        Conditionals con = new Conditionals();
//        con.conditions();

//        Factorial f = new Factorial();
////        f.factorial();
//        f.fact();
//
//        Calculator calc = new Calculator();
//        calc.calculate();

//        User  user = new User();
//        user.userInfo();
//        //user.username has private access


//        Account ac = new Account();
////        ac.getBalance(); // protected access


//        Main m = new Main();
//        m.getBalance();

//        Account  a = new Account();
//        System.out.println(a.getBalance());
//        a.setBalance(100);
//        System.out.println(a.getBalance());

        ATM atm = new ATM();
        atm.greet("Abdallah");
        atm.greet("Ahmed");

        atm.checkBalance();

        atm.deposit(100);
        atm.checkBalance();

        atm.deposit(200);
        atm.checkBalance();

        ATM ahmed = new ATM(); // different instance
        ahmed.checkBalance();


    }
}