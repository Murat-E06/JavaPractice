package day14_String;

import java.util.Scanner;

public class TwoWordTogether {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first word");
        String w1 = scan.next();

        System.out.println("Please enter your second word");
        String w2 = scan.next();
        scan.close();

        char firsLast = w1.charAt(w1.length()-1);
        char secondLast = w2.charAt(w2.length()-1);
        String w3 = w2.substring(1);

        if (firsLast == secondLast) {
            System.out.println(w1 + w3);
        }


    }
}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the
last letter is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */