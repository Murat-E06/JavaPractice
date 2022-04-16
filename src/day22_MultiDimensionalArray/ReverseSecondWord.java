package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String str="I Love Java";
        String[]sentence=str.split(" ");
        System.out.println(Arrays.toString(sentence));//[I, Love, Java]

        String reverseWord="";
        for (int i = sentence[1].length()-1; i >=0 ; i--) {
            reverseWord+=sentence[1].charAt(i);
        }
        System.out.println(reverseWord);//evoL

        sentence[1]=reverseWord;

        System.out.println(Arrays.toString(sentence));//[I, evoL, Java]

        for (String each : sentence) {
            System.out.print(each+" ");

        }

    }
}
/*
 Write a program that can reverse the second word of the sentence
sentence = "I Love Java";
output:
I evoL Java
 */