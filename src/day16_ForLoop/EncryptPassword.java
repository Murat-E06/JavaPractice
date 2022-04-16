package day16_ForLoop;

public class EncryptPassword {
    public static void main(String[] args) {
        String password = "cydeo";
        char encryptWithChar = 'x';
        String encryptedPassWord = " ";
        for (int i = 0; i < password.length(); i++) {
            encryptedPassWord += "" + password.charAt(i) + encryptWithChar;//if we dont use "" it returns char, String+char+char=String

        }
        System.out.println("encryptedPassWord = " + encryptedPassWord);

    }
}
/*
pasword: cydeo
encrypt with x
output: cxyxdxexox
 */