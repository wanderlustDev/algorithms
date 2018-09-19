package com.practice.algorithms.selectionsort;

public class SelectionSortAlgorithm {

    public int[] selectionSort(int[] arr, int n) {

        int k = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int flag = 0;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    k = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                temp = arr[i];
                arr[i] = min;
                arr[k] = temp;
            }
        }
        return arr;
    }

    public int[] selectionSort2(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int minIndex = indexOfMinimum(arr, i, n);
            swap(arr, i , minIndex);
        }
        return arr;
    }

    private void swap (int[] arr, int firstIndex, int secondIndex) {
        int temp;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private int indexOfMinimum (int[] arr, int startIndex, int n) {
        int minValue = arr[startIndex];
        int minIndex = startIndex;

        for (int i = minIndex + 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
