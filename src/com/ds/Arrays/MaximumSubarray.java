package com.ds.Arrays;

/**
 * Created by rahul.rawat on 5/20/2017.
 */
public class MaximumSubarray {
    public static int maxSubarray(int input[]) {
        int maxEnding = 0;
        int currentMax = 0;
        for (int i = 0; i < input.length; i++) {
            maxEnding = maxEnding + input[i];
            if (currentMax < maxEnding)
                currentMax = maxEnding;
            if (maxEnding < 0)
                maxEnding = 0;
        }
        return currentMax;
    }

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubarray(a));
    }
}
