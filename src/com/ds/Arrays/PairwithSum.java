package com.ds.Arrays;

import java.util.HashMap;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class PairwithSum {
    public static boolean findPair(int [] input, int sum){
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<input.length;i++){
                if(hm.get(sum-input[i])!=null && hm.get(sum-input[i])){
                    System.out.println("Pair is "+input[i]+", "+(sum-input[i]));
                    return true;
                }
                else
                    hm.put(input[i],true);
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        System.out.println(findPair(A,14));
    }
}
