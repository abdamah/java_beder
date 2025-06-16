package com.riigsoft.linkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList {
    private static class Node {
        private final int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        var index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) return index;

            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        last = getPrevious(last);
        assert last != null;
        last.next = null;
        size--;
    }

    private Node getPrevious(Node node) {

        var current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var index = 0;
        var current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        var prev = first;
        var cur = first.next;
        while (cur != null) {
            var next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        last = first;
        last.next = null;
        first = prev;
    }

    public void printList() {
        var current = first;
        System.out.print("[");
        while (current != null) {
            if (current.next == null) System.out.print(current.value);
            else System.out.print(current.value + ", ");

            current = current.next;
        }
        System.out.println("]");
    }


}
