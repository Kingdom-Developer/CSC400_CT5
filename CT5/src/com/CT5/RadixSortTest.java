package com.CT5;

/**
 * Class to test out the radix sort algorithm
 *
 * @author Nolan_Hill
 */
public class RadixSortTest {
    /**
     * Test program that takes three sample arrays and sorts them
     * using the RadixSort method.
     *
     * @param args user arguments (not used)
     */
    public static void main(String[] args) throws IllegalArgumentException {
        // Store three array samples
        int[] sample1 = null;
        int[] sample2 = {};
        int[] sample3 = {7234, 3891, 9456, 1672, 5823, 4109, 8567, 2345, 6901, 3478, 9012, 1234, 7890, 4567, 6123};

        // Sort each sample array using the radixSort method
        try {
            RadixSort.radixSort(sample1);

            // Print sorted elements of first sample
            System.out.print("Sorted elements: ");
            for (int element : sample1) {
                System.out.print(element + " ");
            }
            System.out.println();
        } catch(IllegalArgumentException e) {
            System.out.println("Unable to sort sample1: " + e.getMessage());
        }

        try {
            RadixSort.radixSort(sample2);

            // Print sorted elements of second sample
            System.out.print("Sorted elements: ");
            for (int element : sample2) {
                System.out.print(element + " ");
            }
            System.out.println();
        } catch(IllegalArgumentException e) {
            System.out.println("Unable to sort sample2: " + e.getMessage());
        }

        try {
            RadixSort.radixSort(sample3);

            // Print sorted elements of third sample
            System.out.print("Sorted elements: ");
            for (int element : sample3) {
                System.out.print(element + " ");
            }
            System.out.println();
        } catch(IllegalArgumentException e) {
            System.out.println("Unable to sort sample3: " + e.getMessage());
        }
    }
}