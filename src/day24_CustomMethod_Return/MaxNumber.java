package day24_CustomMethod_Return;

public class MaxNumber {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        maxNumber(arr);



    }
    //create a method that can return the maximum number from an array of integers
    public static int maxNumber(int[]numbers){
        int max=numbers[0];//eğer bunu forun içine atarsak hata veriyor print stat forun dışında ol.için tanımıyor!!
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max = " + max);
        return max;
        }




    }




