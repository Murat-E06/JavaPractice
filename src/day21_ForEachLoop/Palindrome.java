package day21_ForEachLoop;

public class Palindrome {
    public static void main(String[] args) {
        String[]str={"anna", "level", "Java"};

        int count=0;
        for (String each : str) {
            String result="";
            for (int i = each.length() - 1; i >= 0; i--) {
                result+=each.charAt(i);
            }
            if(result.equals(each)){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
 */