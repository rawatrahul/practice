package com.ds.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println(countPairs(arr));
    }

    private static int countPairs(int[] arr) {
        int temp[] = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int inversionCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            inversionCount = mergeSort(arr, temp, left, mid);
            inversionCount += mergeSort(arr, temp, mid + 1, right);
            inversionCount += merge(arr, temp, left, mid + 1, right);
        }
        return inversionCount;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int iCount = 0;
        int i = left,
                j = mid,
                k = left;
        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                iCount = iCount + (mid - i);
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i < right; i++)
            arr[i] = temp[i];

        return iCount;
    }
}
