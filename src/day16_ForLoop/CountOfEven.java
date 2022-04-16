package day16_ForLoop;

public class CountOfEven {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 5; i <= 50; i++) {
            if (i % 2 == 0) {
                ++count;
            }

        }
        System.out.println(count);

    }
}
//display even numbers 5~50 and how many numbers