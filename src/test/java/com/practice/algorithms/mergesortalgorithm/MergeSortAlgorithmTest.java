package com.practice.algorithms.mergesortalgorithm;

import com.practice.algorithms.mergesort.MergeSortAlgorithm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortAlgorithmTest {

    @Test
    public void testSelectionSortAlgorithm2() {
        MergeSortAlgorithm mergeSortAlgorithm =  new MergeSortAlgorithm();
        int[] arr = {55, 17, 6, 39, 42, 78, 69, 63, 37, 7, 61, 67, 44, 47, 18, 100, 33, 41, 89, 75};
        int n = arr.length;
        int[] result = mergeSortAlgorithm.mergeSort(arr);
        assertEquals(6, result[0]);
    }

    @Test
    public void testss() {
        float n = 2f;
        float m  = 5f;
        float k = n/m;
        System.out.println(k);
    }
}
