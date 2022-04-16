package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String searchResult="1-16 of 829 results for ipad";//we want to get 829
        
        String[] each=searchResult.split(" ");
        System.out.println(Arrays.toString(each));
        
        String searchAmaunt=each[2];
        System.out.println("searchAmaunt = " + searchAmaunt);
        

        
    }
}
