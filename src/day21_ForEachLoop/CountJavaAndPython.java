package day21_ForEachLoop;

import java.util.Arrays;

public class CountJavaAndPython {
    public static void main(String[] args) {
        String sentence = "java java python python java python";
        String[]words=sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int countJ=0,
            countP=0;
        for (String each : words) {
            if(each.equalsIgnoreCase("java")){
                countJ++;
            }if (each.equalsIgnoreCase("python")){
                countP++;
            }

        }
        System.out.println("countJ = " + countJ);
        System.out.println("countP = " + countP);





    }
}
