package com.practice.hackerrank;

public class MiniMaxSum {

    public void calculate(int[] arr) {
        int max = 0;
        int min = arr[0];
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                minSum += arr[i];
            }
            if (arr[i] != min) {
                maxSum += arr[i];
            }
        }

        System.out.println(minSum + " " + maxSum);
    }
}
