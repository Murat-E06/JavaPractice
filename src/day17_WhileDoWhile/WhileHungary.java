package day17_WhileDoWhile;

public class WhileHungary {
    public static void main(String[] args) {
        boolean isHungary=true;
        int banana=0;
        int countToFull=3;

        while (isHungary){// while(true)
            banana++;
            System.out.println("Eating banana:\uD83C\uDF4C "+banana);//unicodes:🍌
            if (banana==countToFull) {
                isHungary=false;//break; is the same result important for me!! branching statement.
            }
        }
        System.out.println("Had enough bananas, Lets start to study");





}}