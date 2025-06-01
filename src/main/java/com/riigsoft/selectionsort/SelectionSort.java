package com.riigsoft.selectionsort;

public class SelectionSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {
            int minIndex = i;

            minIndex = findMinIndex(array, i, minIndex);
            swap(array, minIndex, i);
        }

    }

    private static int findMinIndex(int[] array, int start, int minIndex) {
        for (var j = start; j < array.length; j++)
            if (array[j] < array[minIndex])
                minIndex = j;
        return minIndex;
    }

    private void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
