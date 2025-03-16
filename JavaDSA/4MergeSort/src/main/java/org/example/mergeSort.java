package org.example;

public class mergeSort {

    static void mergesort(int[] array) {
        int length = array.length;
        if (length <= 1) return;  // Base case

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        // Copy elements into left and right subarrays
        for (int i = 0; i < length; i++) {
            if (i < middle) {
                left[i] = array[i];
            } else {
                right[i - middle] = array[i];
            }
        }

        // Recursively sort the subarrays
        mergesort(left);
        mergesort(right);

        // Merge the sorted subarrays back into array
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, l = 0, r = 0;

        // Merge elements from left and right into array
        while (l < leftSize && r < rightSize) {
            if (left[l] <= right[r]) {
                array[i++] = left[l++];
            } else {
                array[i++] = right[r++];
            }
        }
        // Copy any remaining elements from left
        while (l < leftSize) {
            array[i++] = left[l++];
        }
        // Copy any remaining elements from right
        while (r < rightSize) {
            array[i++] = right[r++];
        }
    }
}

