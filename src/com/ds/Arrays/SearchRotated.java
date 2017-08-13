package com.ds.Arrays;

import java.util.Scanner;

public class SearchRotated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array;
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            array = new int[d];
            int pivot = 0;
            for (int j = 0; j < d; j++) {
                array[j] = scan.nextInt();
                if (j > 0 && array[j - 1] > array[j])
                    pivot = j - 1;
            }

            int k = scan.nextInt();
            System.out.println(findElement(array, k, pivot));
            array = null;
        }

    }

    private static int findElement(int[] array, int k, int pivot) {
        int res = binarySearch(array, pivot, 0, k);
        if (res == -1)
            return binarySearch(array, array.length - 1, pivot + 1, k);
        else
            return res;

    }

    public static int binarySearch(int input[], int high, int low, int key) {
        if (high < low) return -1;
        if (high == low)
            return input[high] == key ? high : -1;

        int mid = (high + low) / 2;
        if (input[mid] == key) return mid;
        if (key > input[mid])
            return binarySearch(input, high, mid + 1, key);
        return binarySearch(input, mid - 1, low, key);
    }
}
