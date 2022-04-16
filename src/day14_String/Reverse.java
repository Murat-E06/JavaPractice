package day14_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word please");
        String word = scan.next();
        int l = word.length();
        String reverse = "";
        char ch = word.charAt(0);


        if (l < 5) {
            System.out.println("Too short!");
        } else if (l > 5) {
            System.out.println("Too long!");
        } else {
            for (int i = l - 1; i >= 0; i--) {
                ch = word.charAt(i);
                reverse += ""+ch;

            }
        }
        System.out.println("reverse = " + reverse);
        scan.close();



    }
}
