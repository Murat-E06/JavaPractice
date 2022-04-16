package day20_Arrays;

import java.util.Scanner;

public class MaxAndMinNumberForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int each : numbers) {
            if (each > numbers[0]) {
                max = each;
            }
            if (each < numbers[0]) {
                min = each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();


    }
}
/*
Write a program that asks user to enter a number 10 times:
1. store all user entered numbers in an array
2. find the max number
3. find the min number
 */
