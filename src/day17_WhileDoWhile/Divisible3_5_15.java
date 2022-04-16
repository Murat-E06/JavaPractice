package day17_WhileDoWhile;

import java.util.Scanner;

public class Divisible3_5_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number bigger than 15");
        int n = scan.nextInt();

        String divisibleBy15 = "",
                divisibleBy5 = "",
                divisibleBy3 = "";


        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                divisibleBy15 += i+" ";
            }

            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 +=i+ " ";

            }
            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i+" ";
            }

        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);

        scan.close();


    }
}

