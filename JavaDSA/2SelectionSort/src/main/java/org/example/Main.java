package org.example;

public class Main {
    public static void main(String[] args) {

        // selection sort = search through an array and keep track of the minimum value during
        //     each iteration. At the end of each iteration, we swap variables.

        //     Quadratic time O(n^2)
        //     small data set = okay
        //     large data set = BAD

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        System.out.print("Original array: ");

        for(int i : array){
            System.out.print(i + " ");
        }

        System.out.println();

        SelectionSort.selectionSort(array);

        System.out.print("Sorted array: ");

        for(int i : array){
            System.out.print(i + " ");
        }
    }
}