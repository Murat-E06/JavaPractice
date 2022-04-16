package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        int[][] reverse2D = new int[arr2D.length][];

        System.out.println(Arrays.deepToString(reverse2D));
        System.out.println("---------------------------");

        for (int i = arr2D.length - 1, j = 0; i >= 0; i--, j++) {
            reverse2D[j] = new int[arr2D[i].length];

            for (int k = arr2D[i].length - 1, l = 0; k >= 0; k--, l++) {
                reverse2D[j][l] = arr2D[i][k];
            }
        }
        System.out.println(Arrays.deepToString(reverse2D));
    }
}
/*
Write a program that can reverse a two dimensional array (return new
array)
array = { {1,2,3}, {4,5,6}};
output:
reverse = { {6,5,4}, {3,2,1},};
 */