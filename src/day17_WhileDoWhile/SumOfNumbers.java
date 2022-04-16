package day17_WhileDoWhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);

    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
hint: you need an infinite loop
 */