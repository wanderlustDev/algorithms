package com.practice.hackerrank;

import org.junit.Test;

public class MiniMaxSumTest {

    @Test
    public void testMiniMaxSum() {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        MiniMaxSum miniMaxSum = new MiniMaxSum();
        miniMaxSum.calculate(arr);
    }
}
