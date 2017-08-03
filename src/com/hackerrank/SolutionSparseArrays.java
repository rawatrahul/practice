package com.hackerrank;

/**
 * Created by rahul.rawat on 8/3/2017.
 */

import java.util.HashMap;
import java.util.Scanner;

public class SolutionSparseArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> hashMap = new HashMap();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (hashMap.get(s) == null) {
                hashMap.put(s, 1);
            } else
                hashMap.put(s, (hashMap.get(s) + 1));
        }
        int q = scan.nextInt();
        String query[] = new String[q];
        for (int i = 0; i < q; i++) {
            query[i] = scan.next();
        }
        for (int i = 0; i < q; i++) {
            System.out.println(hashMap.get(query[i]));
        }
    }
}
