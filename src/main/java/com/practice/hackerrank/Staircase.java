package com.practice.hackerrank;

public class Staircase {

    public void buildStaircase(int size) {
        for (int i = 1; i <= size; i++) {
            printHash(size - i, " ");
            printHash(i, "#");
            System.out.println();
        }
    }

    public void printHash(int size, String print) {
        for (int i = 0; i < size; i++) {
            System.out.print(print);
        }
    }
}
