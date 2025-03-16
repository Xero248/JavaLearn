package org.example;

public class Main {
    public static void main(String[] args) {


        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity    = O(n)

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        System.out.print("Original array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted array: ");

        mergeSort.mergesort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}