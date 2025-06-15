package com.riigsoft;

public class Main {



    public static void main(String[] args) throws Exception{
     var c = Class.forName("com.riigsoft.linkedlist.MyLinkedList");
 var ms = c.getDeclaredMethods();
     for (var m:ms){
         System.out.println(m);
     }

       var fs = c.getDeclaredFields();
     for (var f: fs)
         System.out.println(f);


    }
}
