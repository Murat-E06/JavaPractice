package goodToKnow;

import java.util.Scanner;

public class FreqOfString {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("input string value");//alivelialiveliali ALiaLİvali
            String sentence = scan.nextLine();

            System.out.println("input second value");//ali
            String lookFor = scan.next();
            scan.close();

            int frequency = 0;

            for (int i = 0; i <= (sentence.length()-lookFor.length()); i++) {

                if(sentence.substring(i, (i+ lookFor.length())).equalsIgnoreCase(lookFor)){
                    frequency++;
                }
            }
            System.out.println(frequency);//6
        }
    }