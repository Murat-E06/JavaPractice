package day24_CustomMethod_Return;

import java.util.Arrays;

public class FrequencyOfWord {
    public static void main(String[] args) {
       /* int count = 0;
        String str = "Java java jAVA python python";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for (String each : words) {
            if (each.equalsIgnoreCase("java")) {
                count++;
            }
        }
        System.out.println(count);

        */
        System.out.println("-----------------------------");

        int freq=freqOfWord("ali ali veli ALİ ALi aLİ","ali");
        System.out.println(freq);




    }

    public static int freqOfWord(String str, String word) {
        int count = 0;
        String[]str1=str.split(" ");
        for (String each : str1) {
            if(each.equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }



    /*
create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3

     */

}











