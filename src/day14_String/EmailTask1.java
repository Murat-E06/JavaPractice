package day14_String;

public class EmailTask1 {
    public static void main(String[] args) {
        String eMail="mike_tyson@gmail.com";

        String first=eMail.substring(0,eMail.indexOf('_'));
        String second=eMail.substring(eMail.indexOf('_')+1,eMail.indexOf('@'));
        System.out.println(second+"_"+first+"@gmail.com");



    }
}
/*
Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */