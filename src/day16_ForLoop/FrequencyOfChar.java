package day16_ForLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = scan.nextLine();

        System.out.println("Enter a char");
        char ch = scan.next().charAt(0);
        scan.close();

        int x = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                x++;
            }
        }
        System.out.println(x+" times");

    }
}
/*
rite a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */