package com.ds.Arrays;

/**
 * Created by rahul.rawat on 5/20/2017.
 */
public class BinarySearch {
    public static int binarySearch(int input[], int high, int low, int key) {
        if (high < low) return -1;
        int mid = (high + low) / 2;
        if (input[mid] == key) return mid;
        if (key > input[mid])
            return binarySearch(input, high, mid + 1, key);
        return binarySearch(input, mid - 1, low, key);
    }

    public static void main(String[] args) {
        int[] data = {0, 2, 4, 6, 10, 23, 61, 89};
        System.out.println(binarySearch(data, data.length, 0, 89));
    }
}
