package day16_ForLoop;

import java.util.Scanner;

public class PosNegNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter" + i + "." + " number");
            int ni = scan.nextInt();
            if (ni > 0) {
                pos++;
            }
            if (ni < 0) {
                neg++;
            }

        }
        System.out.println(pos + " positive and " + neg + " negative");


    }
}
/*
Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */