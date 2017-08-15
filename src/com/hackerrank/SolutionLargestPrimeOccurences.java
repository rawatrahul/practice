package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SolutionLargestPrimeOccurences {
    public static boolean prime[] = new boolean[99];

    public static void main(String args[]) throws Exception {
        int k = 2;

        int a[] = {0, 0, 0, 1, 1, 1, -1, -1, 2, -1};
        System.out.println(getLargestNumberWithPrimeOccurences(a, k));

    }

    static void sieveOfEratosthenes() {
        int n = 99;
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i < n; i += p)
                    prime[i] = false;
            }
        }
    }

    static int getLargestNumberWithPrimeOccurences(int[] inputArray, int minOccurence) {
        sieveOfEratosthenes();
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (h.get(inputArray[i]) == null)
                h.put(inputArray[i], 1);
            else
                h.put(inputArray[i], h.get(inputArray[i]) + 1);
        }
        int maxV = Integer.MIN_VALUE, maxK = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() >= maxV && entry.getValue() >= minOccurence && prime[entry.getValue()]) {
                if (entry.getKey() > maxK) {
                    maxV = entry.getValue();
                    maxK = entry.getKey();
                }

            }
        }
        return maxV > Integer.MIN_VALUE ? maxK : -1;
    }

}