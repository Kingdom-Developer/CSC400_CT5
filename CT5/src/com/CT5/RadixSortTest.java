package com.CT5;
import static com.CT5.RadixSort.radixSort;

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
    public static void main(String[] args) {
        // Store three array samples
        int[] sample1 = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        int[] sample2 = {342, 789, 156, 923, 467, 621, 84, 735, 298, 512};
        int[] sample3 = {7234, 3891, 9456, 1672, 5823, 4109, 8567, 2345, 6901, 3478, 9012, 1234, 7890, 4567, 6123};

        // Sort each sample array using the radixSort method
        radixSort(sample1);
        radixSort(sample2);
        radixSort(sample3);

        // Print sorted elements of first sample
        System.out.print("Sorted elements: ");
        for (int element : sample1) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Print sorted elements of second sample
        System.out.print("Sorted elements: ");
        for (int element : sample2) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Print sorted elements of third sample
        System.out.print("Sorted elements: ");
        for (int element : sample3) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}