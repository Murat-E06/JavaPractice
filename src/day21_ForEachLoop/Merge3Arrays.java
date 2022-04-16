package day21_ForEachLoop;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {
        int[]arr1 = {30, 10, 20},
             arr2 = {15, 40, 25, 35},
             arr3 = {8, 9, 17, 5, 4, 1};

        int[]  merge=new int[arr1.length+arr2.length+arr3.length];
        int i =0;
        for (int each : arr1) {
            merge[i]=each;
            i++;
        }
        for (int each : arr2) {
            merge[i]=each;
            i++;
        }
        for (int each : arr3) {
            merge[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(merge));



    }
}
/*
Write a program that can merge 3 arrays of integers
Ex:
arr1 = {30, 10, 20};
arr2 = {15, 40, 25, 35};
arr3 = {8, 9, 17, 5, 4, 1}
Output:
{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */