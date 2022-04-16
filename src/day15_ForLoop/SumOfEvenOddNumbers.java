package day15_ForLoop;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        int resultEven = 0;

        for (int i = 0; i <= 100; i += 2) {
            resultEven += i;
        }
        System.out.println("resultEven = " + resultEven);
        System.out.println("-----------------------------------");
        int resultOdd = 0;
        for (int i = 1; i <= 100; i += 2) {
            resultOdd += i;
        }
        System.out.println("resultOdd = " + resultOdd);


    }
}
/*
 Write a program that can return the sum of even numbers between 1 
to 100
 */