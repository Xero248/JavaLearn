package org.example;

public class Main {
    public static void main(String[] args) {

        // Insertion sort = after comparing elements to the left,
//    shift elements to the right to make room to insert a value

//     Quadratic time O(n^2)
//     small data set = decent
//     large data set = BAD

//     Less steps than Bubble sort
//     Best case is O(n) compared to Selection sort O(n^2)
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        System.out.print("Original array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        InsertionSort.insertionSort(array);

        System.out.print("sorted array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }




    }
}