package day14_String;

public class EmailTask2 {
    public static void main(String[] args) {
        String eMail = "murat_erbas@gmail.com";
        String firstName = eMail.substring(0, eMail.indexOf('_'));
        String lastName = eMail.substring(eMail.indexOf('_') + 1, eMail.indexOf('@'));
        String domain = eMail.substring(eMail.indexOf('@') + 1, eMail.lastIndexOf('.'));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


        String firstUpper = firstName.toUpperCase();
        char f = firstUpper.charAt(0);
        String result1 = f + firstName.substring(1);
       // System.out.println(firstName.toUpperCase().charAt(0)+firstName.substring(1));

        String lastUpper = lastName.toUpperCase();
        char l = lastUpper.charAt(0);
        String result2 = l + lastName.substring(1);

        System.out.println("First name: " + result1 + "\n" + "Last name: " + result2 + "\n" + "Domain: " + domain);


    }
}
/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */