package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        scan.close();

        int result = 1;
        for (int i = number; i >= 1; i--) {
            result=result*i;
        }
        System.out.println("result = " + result);

    }
}
