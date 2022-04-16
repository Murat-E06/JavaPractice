package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArrayWithReturnMethod {
    public static void main(String[] args) {

        int[]numbers={3,4,5,6,7};
        reversedArray(numbers);

    }
    /*
    create a method that return the reversed array
{1,2,3,4,5} === > {5,4,3,2,1}
     */
    public static int[] reversedArray(int[] arr){  //burada sonuç bir sayı değil bir array ol.için int[] olarak tanıttık yoksa return de hata veriyor!!!
        int[]reversed=new int[arr.length];
        for (int i = 0,j=arr.length-1; i <arr.length ; i++,j--) {
            reversed[i]=arr[j];

        }
        System.out.println(Arrays.toString(reversed));
        return reversed;
    }


}
