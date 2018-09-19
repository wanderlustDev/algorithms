package com.practice.algorithms.bubblesort;

import java.util.Scanner;

public class BubbleSortAlgorithm {

    public int[] bubbleSort (int[] arr, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        return arr;
    }

    public void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
