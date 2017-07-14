package com.ds.Sorting;

import java.util.Arrays;

/**
 * Created by rahul.rawat on 6/4/2017.
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 */
public class SelectionSort {
    public static int[] selectionSort(int[] input) {
        int min = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++)
                if (input[min] > input[j])
                    min = j;
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;

        }
        return input;
    }

    public static void main(String[] args) {
int data[] = {2,5,1,9,4,7};
        System.out.println(Arrays.toString(data));
        data = selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
