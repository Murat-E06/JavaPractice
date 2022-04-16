package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int attempt = scan.nextInt();
        int[] numbers = new int[attempt];

        for (int i = 0; i < attempt; i++) {
            System.out.println("Enter your number");
            numbers[i] = scan.nextInt();
        }

        double total = 0;
        for (int each : numbers) {

            total += each;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Avarage number is: " + total / numbers.length);
    }
}
/*
AverageNumber:
1. Ask the user how many numbers they want to
enter
2. get all the inputs from the user and store
them into an array
3. Iterate the array & return the average
number
 */