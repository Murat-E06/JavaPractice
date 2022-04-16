package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        scan.close();
        String isPalindrome = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            isPalindrome += str.charAt(i);
        }
        System.out.println(isPalindrome.equalsIgnoreCase(str));


    }
}
