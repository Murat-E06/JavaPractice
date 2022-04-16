package goodToKnow;

import java.util.Scanner;

public class CreditCard {

        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a credit card number: ");
            long num = scan.nextLong();

            if (isValid(num)) System.out.println(num + " is valid");
            else System.out.println(num + " is invalid");

        }

        public static boolean isValid(long num) {

            int length = ("" + num).length();
            if (length != 16) {
                System.out.println("You entered invalid length of number");
                return false;
            }

            int total = sumOfOdds(num) + sumOfEvens_doubled(num);

            int remainder = total % 10;

            if (remainder == 0) return true;
            else return false;

            // return (remainder==0)
        }

        public static int sumOfOdds(long num) {

            int sum = 0;
            while (num > 0) {
                int lastDigit = (int) (num % 10);
                sum += lastDigit;
                num = num / 100;
            }
            return sum;

        }

        public static int sumOfEvens_doubled(long num) {

            int sum = 0;

            num = num / 10;

            while (num > 0) {
                int lastDigit = (int) (num % 10);

                if ((lastDigit * 2) > 9) {
                    int singleDigit = ((lastDigit * 2) / 10) + ((lastDigit*2 ) % 10);
                    sum += singleDigit;
                } else {
                    sum += lastDigit * 2;
                }

                num = num / 100;
            }

            return sum;

        }

    }

