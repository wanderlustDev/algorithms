package com.practice.hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    private static final Scanner scanner = new Scanner(System.in);

    static void plusMinus(int[] arr) {
        float arraySize = arr.length;
        float positiveCount = 0f;
        float negativeCount = 0f;
        float zeroCount = 0f;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] > 0) {
                positiveCount++;
            }
        }
        String zeroRatio = getRatio(zeroCount, arraySize);
        String positiveRatio = getRatio(positiveCount, arraySize);
        String negativeRatio = getRatio(negativeCount, arraySize);

        System.out.println(zeroRatio);
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
    }

    static String getRatio(float count, float arraySize) {
        return String.format("%.6f", count/arraySize);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
