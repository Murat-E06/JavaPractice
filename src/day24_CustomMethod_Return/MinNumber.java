package day24_CustomMethod_Return;

public class MinNumber {
    public static void main(String[] args) {
        int[]arr={-2,-100,-1000,5,34};
        minNumber(arr);


    }
    //create a method that can return the minimum number from an array of integers

    public static int minNumber(int numbers[]){
        int min=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("min = " + min);
        return min;
    }




}
