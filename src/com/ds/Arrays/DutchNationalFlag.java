package com.ds.Arrays;

import java.util.Arrays;

public class DutchNationalFlag {
    static int arr[] = {0, 1, 0, 1, 2, 2, 1, 1, 0, 0, 1, 2, 1};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        dutchNationFlag(arr);
    }

    private static void dutchNationFlag(int[] arr) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid, high);
                    high--;
                default:
                    continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
