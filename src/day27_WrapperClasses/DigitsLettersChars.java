package day27_WrapperClasses;

public class DigitsLettersChars {
    public static void main(String[] args) {


    String str = "abcd1234!@#$efghi6789#$%^ABCD";

    String letters = "";
    String uppercaseLetters = "";
    String lowerCaseLetters = "";
    String digits = "";
    String specialChars = "";

        for (char each : str.toCharArray()) {   // char each : primitive
        if(Character.isLetter(each)){
            letters+=each;
            if(Character.isUpperCase(each)){
                uppercaseLetters += each;
            }else{
                lowerCaseLetters += each;
            }
        }else if (Character.isDigit(each)){
            digits += each;
        }else {
            specialChars += each;
        }
    }

        System.out.println("letters = " + letters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("uppercaseLetters = " + uppercaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
}
}
