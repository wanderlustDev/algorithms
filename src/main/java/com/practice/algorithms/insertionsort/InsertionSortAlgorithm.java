package com.practice.algorithms.insertionsort;

public class InsertionSortAlgorithm {

    public int[] insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1 , j);
                j--;
            }
        }
        return arr;
    }

    private int[] swap(int[] arr, int firstIndex, int secondIndex) {
        int temp;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
        return arr;
    }
}
