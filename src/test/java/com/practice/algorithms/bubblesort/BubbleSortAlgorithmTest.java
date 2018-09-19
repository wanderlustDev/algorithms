package com.practice.algorithms.bubblesort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BubbleSortAlgorithmTest {

    @Test
    public void testBubbleSortAlgorithm() {
        BubbleSortAlgorithm bubbleSortAlgorithm =  new BubbleSortAlgorithm();
        int[] arr = {8, 7, 6, 5, 4};
        int n = arr.length;
        int[] result = bubbleSortAlgorithm.bubbleSort(arr, n);
        assertEquals(8, result[4]);
    }

    @Test
    public void testBubbleSortAlgorithm2() {
        BubbleSortAlgorithm bubbleSortAlgorithm =  new BubbleSortAlgorithm();
        int[] arr = {55, 17, 6, 39, 42, 78, 69, 63, 37, 7, 61, 67, 44, 47, 18, 100, 33, 41, 89, 75};
        int n = arr.length;
        int[] result = bubbleSortAlgorithm.bubbleSort(arr, n);
        assertEquals(6, result[0]);
    }
}
