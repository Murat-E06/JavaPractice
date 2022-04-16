package day16_ForLoop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter is the term number for Fibonacci Series");
        int n = scan.nextInt();
        int n1 = 0, n2 = 1, sum;

        String series = " " + n1 + " " + n2 + " ";
        for (int i = 2; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            series += sum + " ";

        }
        System.out.println("Fibonacci series = " + series);

    }
}
/*
Fibonacci sequence
write a prog to print of given terms sum
 */