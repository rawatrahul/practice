package com.ds.Arrays;

/**
 * Created by rahul.rawat on 8/1/2017.
 */
public class MaximumSubMatrix {
    /*
    * Given a matrix of dimensions mxn having all entries as 1 or 0, find out the size of maximum size square sub-matrix with all 1s.
    * http://www.ideserve.co.in/learn/maximum-size-square-sub-matrix-with-all-1s
    */
    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 0, 0, 1, 1},
                {0, 0, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1, 1}
        };
        System.out.println(maximumSizeSquareSubmatrixWithAllOnes(matrix));
    }

    private static int maximumSizeSquareSubmatrixWithAllOnes(int[][] matrix) {
        int max = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        int table[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = matrix[i][j];
                    max = max > table[i][j] ? max : table[i][j];
                } else if (matrix[i][j] == 0) table[i][j] = 0;
                else {
                    table[i][j] = min(table[i - 1][j], table[i - 1][j - 1], table[i][j - 1]) + 1;
                    max = max > table[i][j] ? max : table[i][j];
                }
            }
        }
        return max;
    }

    private static int min(int x, int y, int z) {
        return (x < y ? x : y) < z ? (x < y ? x : y) : z;
    }
}
