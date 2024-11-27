package com.riigsoft;

public class Operators {
    public void operators() {
        int a = 3;
        int b = 5;
        System.out.println("a % b: " + (a % b));
        System.out.println("b % a: " + (b % a));
        System.out.println("b != a: " + (b != a));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b && b > a: " + (a < b && b > a)); // true
        System.out.println("a > b && b > a: " + (a > b && b > a)); // false
        System.out.println("a > b || b > a: " + (a > b || b > a));
    }
}
