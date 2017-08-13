package com.hackerrank;

import java.util.HashMap;

/**
 * Created by rahul.rawat on 6/29/2017.
 */

public class SolutionCircusRaju {
    static HashMap<String, Node> lookup = new HashMap<>();

    public static void main(String[] args) {
        int a[] = {20, 10, 4, 50, 100};
//        int a[] ={6,2,1,4,3,5};
        System.out.println(getOutcomeOfTheFeat(a, 20));
    }

    private static String getOutcomeOfTheFeat(int[] weights, int x) {
        int n = weights.length;
        String res = "Not Balanced";
        Node tmp = minPartition(weights, n - 1, 0, 0, 0, 0);
        if (tmp.d == 0)
            res = "Perfectly Balanced";
        else if (tmp.d <= x)
            res = "Balanced within " + tmp.d;

        return res;
    }

    private static Node minPartition(int[] weights, int n, int s1, int s2, int leftCount, int rightCount) {
        if (n < 0) {
            Node temp = new Node();

            temp.d = (Math.abs(s1 - s2));
            temp.rc = rightCount;
            temp.lc = leftCount;
            return temp;
        }


        String key = n + "|" + s1;
        if (!lookup.containsKey(key)) {

            int inc = minPartition(weights, n - 1, s1 + weights[n] + 1, s2, leftCount + 1, rightCount).d;
            int exc = minPartition(weights, n - 1, s1, s2 + weights[n], leftCount, rightCount + 1).d;
            Node temp = new Node();
            if (inc > exc) {
                temp.d = exc;
                temp.lc = leftCount;
                temp.rc = rightCount + 1;
            } else {
                temp.d = inc;
                temp.lc = leftCount + 1;
                temp.rc = rightCount;
            }
            lookup.put(key, temp);
        }
        return lookup.get(key);
    }

    static class Node {
        int d, rc, lc;

        @Override
        public String toString() {
            return "d: " + d + " rc: " + rc + " lc: " + lc;
        }
    }
}
