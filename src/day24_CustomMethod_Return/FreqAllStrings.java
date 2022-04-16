package day24_CustomMethod_Return;

import java.util.Scanner;

public class FreqAllStrings {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String");
        String sentences = scanner.nextLine();
        System.out.println("Enter your looking for word");
        String word = scanner.next();
        scanner.close();

        int freq = 0;
        for (int i = 0; i <= sentences.length() - word.length(); i++) {
            if (sentences.substring(i, (i + word.length())).equalsIgnoreCase(word)) {
                freq++;
            }
        }
        System.out.println(freq);

         */

        int r = freqOfAnything("ali ali ALİ Ali veliali ali", "ali");
        System.out.println(r);


    }

    public static int freqOfAnything(String sentences, String lookFor) {

        int freq = 0;

        for (int i = 0; i <= sentences.length() - lookFor.length(); i++) {
            if (sentences.substring(i, (i + lookFor.length())).equalsIgnoreCase(lookFor)) {
                freq++;
            }
        }

        return freq;
    }


}
