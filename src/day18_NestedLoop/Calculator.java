package day18_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n1 = scan.nextInt();
        System.out.println("Enter the math operator");
        char op = scan.next().charAt(0);
        while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
            System.err.println("Enter valid operator");
            op = scan.next().charAt(0);
            }
        System.out.println("Enter the second number");
        int n2 = scan.nextInt();
        int result=0;
        if(op=='+'){
            result=n1+n2;
       }else if(op=='-'){
            result=n1-n2;
        }else if(op=='/'){
            result=n1/n2;
        }else {
            result=n1*n2; 
        }
        System.out.println("result = " + result);

        System.out.println("Do you want to continue? (yes/no)");
        String ask=scan.next().toLowerCase();
        if(ask=="yes"){

           // continue;
        }if(ask=="no"){
            System.out.println("Thanks for using Cydeo calculator!");
        }
            
        

        scan.close();

        }

    }


/*
Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */