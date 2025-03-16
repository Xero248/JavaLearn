package org.example;

public class Main {
    public static void main(String[] args) {

        // bubble sort = pairs of adjacent elements are compared, and the elements
        //                          swapped if they are not in order.

        //     Quadratic time O(n^2)
        //     small data set = okay-ish
        //     large data set = BAD (plz don't)


        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};


        System.out.print(" original array: ");

        for (int i : array){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted array: ");

        BubbleSort.bubbleSort(array);

        for (int i : array){
            System.out.print(i + " ");
        }


    }
}