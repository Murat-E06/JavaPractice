package day16_ForLoop;

public class ShowsTenthNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i += 10) {
            if(i%10==0){
                System.out.print(i+" ");
            }

        }


    }
}
//0,10,20,,,1000 total all number