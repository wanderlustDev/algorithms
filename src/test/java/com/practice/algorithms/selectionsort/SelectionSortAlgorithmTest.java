package com.practice.algorithms.selectionsort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SelectionSortAlgorithmTest {

    @Test
    public void testSelectionSortAlgorithm() {
        SelectionSortAlgorithm selectionSortAlgorithm =  new SelectionSortAlgorithm();
        int[] arr = {8, 7, 6, 5, 4};
        int n = arr.length;
        int[] result = selectionSortAlgorithm.selectionSort(arr, n);
        assertEquals(8, result[4]);
    }

    @Test
    public void testSelectionSortAlgorithm2() {
        SelectionSortAlgorithm selectionSortAlgorithm =  new SelectionSortAlgorithm();
        int[] arr = {55, 17, 6, 39, 42, 78, 69, 63, 37, 7, 61, 67, 44, 47, 18, 100, 33, 41, 89, 75};
        int n = arr.length;
        int[] result = selectionSortAlgorithm.selectionSort2(arr, n);
        assertEquals(6, result[0]);
    }
}
