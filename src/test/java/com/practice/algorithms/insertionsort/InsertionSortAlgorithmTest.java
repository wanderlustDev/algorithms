package com.practice.algorithms.insertionsort;

import com.practice.algorithms.selectionsort.SelectionSortAlgorithm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortAlgorithmTest {
    @Test
    public void testSelectionSortAlgorithm2() {
        InsertionSortAlgorithm insertionSortAlgorithm =  new InsertionSortAlgorithm();
        int[] arr = {55, 17, 6, 39, 42, 78, 69, 63, 37, 7, 61, 67, 44, 47, 18, 100, 33, 41, 89, 75};
        int n = arr.length;
        int[] result = insertionSortAlgorithm.insertionSort(arr, n);
        assertEquals(6, result[0]);
    }
}
