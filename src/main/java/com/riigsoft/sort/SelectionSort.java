package com.riigsoft.sort;

public class SelectionSort {
    public void sort(int[] numbers){
        for (var i = 0; i < numbers.length; i++){
//            var minIndex = i;
//            for (var j = i; j < numbers.length; j++)
//                if (numbers[j] < numbers[minIndex])
//                    minIndex =j;
            int minIndex = findMinIndex(numbers, i);
            swap(numbers, minIndex, i);
        }
    }
    private  void swap(int [] numbers, int index1, int index2){
        var temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
    private int findMinIndex(int[] numbers, int minIndex) {
        for (var i = minIndex; i < numbers.length; i++)
            if (numbers[i] < numbers[minIndex])
                minIndex = i;

        return minIndex;
    }
}
