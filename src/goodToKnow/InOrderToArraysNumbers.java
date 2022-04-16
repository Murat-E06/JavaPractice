package goodToKnow;

import java.util.Arrays;
import java.util.Scanner;

public class InOrderToArraysNumbers {

        public static void main(String[] args) throws InterruptedException {

            Scanner scanner = new Scanner(System.in);

            int[] arr = new int[10];

            //girilen 10 adet sayıyı sıralı hale getirecek!!

            System.out.println("input array numbers: ");//girilen 10 adet sayıyı sıralı hale getirecek!!
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(sortArray(arr)));
        }

        public static int[] sortArray(int[] inputArray) {
            int counter = 0;
            int change = 0;

            while (!isSorted(inputArray)) {
                for (int i = 0; i < inputArray.length - 1; i++) {
                    counter++;
                    if (inputArray[i] > inputArray[i + 1]) {
                        int tempNumber = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = tempNumber;
                        change++;
                    }
                }
            }

            System.out.println("change = " + change);
            System.out.println("counter = " + counter);
            return inputArray;
        }

        public static boolean isSorted(int[] inputArray) {
            boolean sorted = true;

            for (int i = 0; i < inputArray.length - 1; i++) {

                if (inputArray[i] > inputArray[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            return sorted;
        }

    }

