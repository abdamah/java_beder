package com.riigsoft.sort;

public class SelectionSort {
    public void sort(int[] numbers) {
        for (var i = 0; i < numbers.length; i++) {
            var minIndex = findMinIndex(numbers, i);
            swap(numbers, minIndex, i);
        }
    }

    private void swap(int[] numbers, int index1, int index2) {
        var temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    private int findMinIndex(int[] numbers, int mindIndex) {
        for (var j = mindIndex; j < numbers.length; j++)
            if (numbers[j] < numbers[mindIndex])
                mindIndex = j;

        return mindIndex;
    }
}
