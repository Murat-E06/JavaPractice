package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {8, 10, 5, 7, 1, 9, 3};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] reverse = new int[numbers.length];
        System.out.println(Arrays.toString(reverse));//empty=>7x0

        for (int i = 0,j=numbers.length-1 ; i < numbers.length; i++, j--) {
            reverse[i] = numbers[j];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
