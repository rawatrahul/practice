package com.hackerrank;

/**
 * Created by rahul.rawat on 8/3/2017.
 */

import java.util.Scanner;

public class SolutionAlgorithmicCrush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        int m = scan.nextInt();
        int a, b, k;
        for (int i = 0; i < m; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            k = scan.nextInt();
            arr[a] += k;
            if ((b + 1) <= n) arr[b + 1] -= k;
        }
        int max = 0, tempMax = 0;
        for (int i = 1; i <= n; i++) {
            tempMax = tempMax + arr[i];
            if (max < tempMax) max = tempMax;

        }
        System.out.println(max);
    }
}
