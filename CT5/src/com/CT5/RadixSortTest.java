package com.CT5;

import static com.CT5.RadixSort.radixSort;

public class RadixSortTest {
    public static void main(String[] args) {
        int[] sample = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};

        radixSort(sample);

        // Print sorted elements
        System.out.print("Sorted elements: ");
        for (int element : sample) {
            System.out.print(element + " ");
        }
    }
}
