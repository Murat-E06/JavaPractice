package day16_ForLoop;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String str = "JavaJavajava";
        int count = 0;

        for (int i = 0; i <= str.length()-4; i++) {//if word has 4 chars we must subtract 4 from length. contrary it goes out of range to strings range(i+4)
            String s = str.substring(i, i + 4);
            if (s.equalsIgnoreCase("Java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */