package com.riigsoft;

import com.riigsoft.linkedlist.MyLinkedList;

public class Main {



    public static void main(String[] args) throws Exception{
   var list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(30);
        System.out.println(list.size());
   list.printList();

    }
}
