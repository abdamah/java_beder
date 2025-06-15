package com.riigsoft.stack;

import java.util.Scanner;

public class StackImpl implements IStack {
    private final int[] items;
    private int top;

    public StackImpl(int size) {
        items = new int[size];
        top = -1;

    }

    @Override
    public void push(int value) {
        if (isFull())
            throw new StackOverflowError("Stack is overflow");

        items[++top] = value;

    }

    @Override
    public void pop() {
        if (isEmpty())
            throw new IllegalArgumentException("Stack is underflow");

        items[top--] = 0;
    }

    @Override
    public int peek() {
        return items[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == items.length - 1;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i <= top; i++)
            if (items[i] == value)
                return true;

        return false;
    }

    @Override
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(items[i] + " ");
        }


        System.out.println();
    }


    public void menu() {
        int choice;
        do {
            System.out.println("1.push() \n  2.pop()");
            System.out.println("3.peek() \n 4.isEmpty()");
            System.out.println("5.isFully() \n 6.contains()");
            System.out.println("7.size() \n 8.printStack()");
            System.out.println("9.Exit() ");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your choice:");
             choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter a value:");
                        int value = sc.nextInt();
                        push(value);
                    } catch (StackOverflowError e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        pop();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println(peek());
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    isFull();
                    break;
                case 6:
                    System.out.print("Enter a value:");
                    int v = sc.nextInt();
                    System.out.println(contains(v));
                    break;
                case 7:
                    System.out.println(size());
                    break;
                case 8:
                    printStack();
                    break;
                case 9:
                    System.exit(0);
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 9);

    }
}
