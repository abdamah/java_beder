package com.riigsoft.sort;

public class InsertionSort {
    public void sort(int[] numbers) {
        for (var i = 1; i < numbers.length; i++) {
            var current = numbers[i];

            var j = i - 1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
    }
}
