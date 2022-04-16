package utilities;

public class FreqOfAnything {

   //returns freq to anything(digit, letter, word...)
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
