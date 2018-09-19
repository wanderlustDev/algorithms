package com.practice.algorithms.quicksort;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuickSortAlgorithmTest {

    @Test
    public void testQuickSort() {
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        QuickSortAlgorithm algorithm = new QuickSortAlgorithm();
        int[] result = algorithm.quickSort(arr, 0, arr.length - 1);
        assertEquals(10, result.length);
    }
}
