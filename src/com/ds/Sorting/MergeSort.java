package com.ds.Sorting;

/**
 * Created by rahul.rawat on 6/7/2017.
 */
public class MergeSort {
    public static void sort(int input[], int l, int r) {
        if (r > l) {
            int m = (l + r) / 2;
            sort(input, l, m);
            sort(input, m + 1, r);
            merge(input, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int s1 = m + 1 - l;
        int s2 = r - m;

        int L[] = new int[s1];
        int R[] = new int[s2];

        for (int i = 0; i < s1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < s2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < s1 && j < s2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < s1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < s2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
