package day20_Arrays;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {
        String[]names={"Ali Erbas","Oya Bakır","Mert Uygun","Can Client"};
        /*
        for (int i = 0; i < names.length ; i++) {
            String initials=names[i].charAt(0)+"."+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(initials);
        }


        }
        */
            for(String each: names){
                String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
                System.out.println(initial);
            }



    }
}
/*
create an array named classmates, and store 4 of your classmates'
full names
print the initials of each classmates in separate lines
 */