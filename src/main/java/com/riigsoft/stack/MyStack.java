package com.riigsoft.stack;

public class MyStack {
    private int [] sizes;
    private int len;
    private  int top;

    public MyStack( int size) {
       sizes  = new int[size];
        len = 0;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }


}
