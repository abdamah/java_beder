package com.riigsoft.array;

public class MyArray {
    private int[] items;
    int count;

    public MyArray(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (count == items.length - 1) {
            int[] newItems = new int[count * 2];

            if (count >= 0) System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;
        }
        items[count++] = item;

    }

    public void removeAt(int index) {
        if (index < 0 || index > count) throw new IllegalArgumentException("Array index out of boundary");

        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];

        count--;

    }

    public int indexOf(int item) {
        for (int index = 0; index < count; index++)
            if (items[index] == item)
                return index;
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public int size() {
        return count;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);

            if (i < count - 1) System.out.print(",");
        }
        System.out.println("]");
    }

}
