package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a string");
        String str=scan.nextLine();
        scan.close();
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        System.out.println("reverse = " + reverse);

    }
}
/*
Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */