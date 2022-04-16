package day14_String;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String str = scan.next();
        scan.close();

        char first = str.charAt(0);

        if (first >= '0' && first <= '9') {
            System.out.println("first character is digit");
        } else if (first >= 'A' && first <= 'Z') {
            System.out.println("first character is uppercase letter");
        } else if (first >= 'a' && first <= 'z') {
            System.out.println("first character is lowercase letter");
        } else {
            System.out.println("first character is special character letter");
        }

    }
}
/*
Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */