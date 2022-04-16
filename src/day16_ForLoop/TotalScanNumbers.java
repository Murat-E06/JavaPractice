package day16_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TotalScanNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter upper bound");
        int number = scan.nextInt();
        scan.close();
        int total = 0;

        if (number == 5) {
            for (int i = 0; i <= number; i++) {
                total += i;
            }

        } else if (number == 11) {
            for (int i = 0; i <= number; i++) {
                total += i;
            }

        } else if (number == 100) {
            for (int i = 0; i <= number; i++) {
                total += i;
            }


        }
        System.out.println("total = " + total);
    }
}
/*
Write a prog to calculate sum of the numbers from 1 till upper bound
if upper bound 5 sum should be 1+2+3...+5=66
if upper bound 11 sum should be 1+2+3...+11=66
if upper bound 100 sum should be 1+2+3...+100=5050
 */