package day31_Constructors;

import java.util.ArrayList;

public class CarpetObjets {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5., 10., 200, true);
        Carpet carpet2=new Carpet(10,20,100,false);

        System.out.println(carpet1);
        System.out.println(carpet2);

        ArrayList<Carpet> carpetList = new ArrayList<>();

        for (int i = 0; i < 99; i++) {
            carpetList.add(carpet1);
        }

        carpetList.add(carpet1);

        System.out.println(carpetList.size());//100

        double total = 0;
        for (Carpet each : carpetList) {
            total += each.calcCost();

        }
        System.out.println(total);//1020000 if it is not persian(false):1000000


    }
}
