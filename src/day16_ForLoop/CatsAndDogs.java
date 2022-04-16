package day16_ForLoop;

public class CatsAndDogs {
    public static void main(String[] args) {
        String str = "cat dog dogG cAT";
        int cat = 0;
        int dog = 0;

        for (int i = 0; i <=str.length() - 3; i++) {
            if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
                cat++;

            }
            if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
                dog++;
            }


        }
        boolean result = cat == dog;
        System.out.println(result);

    }
}
/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */