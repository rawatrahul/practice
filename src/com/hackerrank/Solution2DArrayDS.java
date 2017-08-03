package com.hackerrank;

/**
 * Created by rahul.rawat on 8/3/2017.
 */

import java.util.Scanner;


public class Solution2DArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int arr_i = 1; arr_i < 5; arr_i++) {

            for (int arr_j = 1; arr_j < 5; arr_j++) {
                maxSum = Math.max(maxSum, hourGlass(arr, arr_i, arr_j));
            }
        }
        System.out.println(maxSum);
    }

    public static int hourGlass(int[][] a, int i, int j) {
        return a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1] + a[i][j];
    }
}
