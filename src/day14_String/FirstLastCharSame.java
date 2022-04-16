package day14_String;

import java.util.Scanner;

public class FirstLastCharSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word please");
        String word = scan.next();
        scan.close();

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }


    }
}
/*
write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */
