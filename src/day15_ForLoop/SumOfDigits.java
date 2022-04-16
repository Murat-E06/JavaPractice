package day15_ForLoop;

import javax.lang.model.SourceVersion;

public class SumOfDigits {
    public static void main(String[] args) {

        String input="A1b2C3a4";
        int total=0;
        int l=input.length();

        for (int i = 0; i <l ; i++) {
            if(input.charAt(i)>='0' && input.charAt(i)<='9'){
                total+=input.charAt(i)-48; // 48=asci0
            }
        }
        System.out.println("total = " + total);
    }
}
