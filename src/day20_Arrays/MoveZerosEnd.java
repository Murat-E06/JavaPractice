package day20_Arrays;

import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[]numbers={10,0,5,0,1,0};
        int[]reverse=new int[numbers.length];

            int j=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]!=0){
                reverse[j]=numbers[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(reverse));



    }
}
/*
write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */