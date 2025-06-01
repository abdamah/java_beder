package com.riigsoft;

public interface IStack {
    void push(int value);
    void pop();
    int peek();
    int size();
    boolean isEmpty();
    boolean isFull();
    boolean contains(int value);
    void printStack();
}
