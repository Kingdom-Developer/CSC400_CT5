package com.CT5;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * A sorting algorithm that implements the Radix approach.
 * <p>
 *  Algorithm that sorts each element of array into buckets from 0-9 based on the digit being evaluated,
 *  from least significant to most significant.
 * </p>
 *
 * @author Nolan_Hill
 */
public class RadixSort {
    /**
     * A method that uses array of ArrayLists to hold each value as they are evaluated
     * @param values the input array to be sorted
     */
    public static void radixSort(int[] values) {
        // Check if input array is null
        if (values == null) {
            throw new IllegalArgumentException("Invalid entry, input array cannot be null.");
        }

        // Check if input array is empty
        if (values.length == 0) {
            throw new IllegalArgumentException("Invalid entry, input array cannot be empty.");
        }

        // Array of ArrayLists that act as the buckets from 0 to 9
        ArrayList<Integer>[] buckets = new ArrayList[10];

        // Find largest number in input array
        int maxNum = Arrays.stream(values).max().getAsInt();

        // Find the highest number of digits that will occur
        int maxDigits = String.valueOf(abs(maxNum)).length();

        // Initiate each ArrayList (bucket)
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Declare and initiate variable to hold location of digit
        int powerTen = 1;

        // Variable to hold index of bucket
        int bucketNumber;

        // Iterate through elements to fill the buckets from the least significant digit to most
        for (int digitIndex = 0; digitIndex < maxDigits; digitIndex++) {
            // Evaluate each element according to the digit location
            for (int i = 0; i < values.length; i ++) {
                bucketNumber = abs(values[i] / powerTen) % 10;
                buckets[bucketNumber].add(values[i]);
            }

            // Declare and initialize iterator variable for values array
            int valuesIndex = 0;

            // Iterate through each buckets
            for (int i = 0; i < 10; i++) {
                // Iterate through the values of each bucket and assign them to values array
                for (int j = 0; j < buckets[i].size(); j++) {
                    values[valuesIndex] = buckets[i].get(j);
                    valuesIndex++;
                }
                buckets[i].clear();
            }
            // Clear values out of the bucket
            for (int i = 0; i < 10; i++) {
                buckets[i].clear();
            }

            // Move to the next significant digit
            powerTen = powerTen * 10;
        }
    }
}