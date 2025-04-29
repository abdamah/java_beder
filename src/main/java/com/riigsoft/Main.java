package com.riigsoft;

import com.riigsoft.array.MyArray;


public class Main {
    public static void main(String[] args) {
       var arr = new MyArray(3);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(6);
       arr.print();
       arr.removeAt(3);
        System.out.println(arr.indexOf(5));
        System.out.println(arr.contains(7));
       arr.print();

    }
}
