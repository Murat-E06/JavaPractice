package day21_ForEachLoop;

public class EvenAndOddTotal {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 8, 4, 12, 10};
        int countEven = 0;
        int countOdd = 0;

        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;

            }

        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);


    }
}
/*
Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */