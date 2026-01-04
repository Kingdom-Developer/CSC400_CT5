package com.CT5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    /**
     * Test to ensure a valid input array sorts correctly using radixSort
     */
    @Test
    void testValidArraySortsCorrectly() {
        int[] input1 = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        int[] expected1 = {94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783};

        RadixSort.radixSort(input1);
        assertArrayEquals(expected1, input1);
    }

    /**
     * Test to ensure null input array throws IllegalArgumentException
     */
    @Test
    void testNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RadixSort.radixSort(null);
        });
    }

    /**
     * Test to ensure empty input array throws IllegalArgumentException
     */
    @Test
    void testEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
           RadixSort.radixSort(new int[]{});
        });
    }
}