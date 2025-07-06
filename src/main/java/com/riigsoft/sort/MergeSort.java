package com.riigsoft.sort;

public class MergeSort {

    public void sort(int[] numbers) {
        if (numbers.length < 2)
            return;

        int mid = numbers.length / 2;

        int[] left = new int[mid];
        for (var i = 0; i < mid; i++)
            left[i] = numbers[i];

        int[] right = new int[numbers.length - mid];
        for (var i = mid; i < numbers.length; i++)
            right[i - mid] = numbers[i];

        sort(left);
        sort(right);
        merge(left, right, numbers);

    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }

}
