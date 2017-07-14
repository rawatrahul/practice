package com.ds.Arrays;

/**
 * Created by rahul.rawat on 6/26/2017.
 */
public class Rotation2D {
    public static void rotateMatrix(int input[][], int size) {
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - i - 1; j++) {
                int tmp = input[i][j];
                input[i][j] = input[j][size - i - 1];
                input[j][size - i - 1] = input[size - i - 1][size - j - 1];
                input[size - i - 1][size - j - 1] = input[size - j - 1][i];
                input[size - j - 1][i] = tmp;
            }
        }
    }

    public static void displayMatrix(int mat[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(mat[i][j] + " ");

            System.out.println();
            ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };
        displayMatrix(mat,4);
        rotateMatrix(mat,4);
        displayMatrix(mat,4);
    }

}
