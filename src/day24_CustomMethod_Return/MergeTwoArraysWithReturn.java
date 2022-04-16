package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArraysWithReturn {
    public static void main(String[] args) {
        int[] n1 = {1, 3, 5, 7};
        int[] n2 = {2, 4, 6, 8};

        mergeArrays(n1, n2);
    }

    /*
    create a method that can merge two arrays and return the new array
arr1 = {1,2,3}
arr2 = {4,5}
{1,2,3,4,5}
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            merge[i] += each;
            i++;
        }
        for (int each : arr2) {
            merge[i] += each;
            i++;
        }
        System.out.println(Arrays.toString(merge));
        return merge;
    }

}
