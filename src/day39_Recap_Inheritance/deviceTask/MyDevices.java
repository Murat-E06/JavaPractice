package day39_Recap_Inheritance.deviceTask;

public class MyDevices {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("13 Pro Max",1100,6.7);
        System.out.println(iphone);
        iphone.faceTime(3352655);
        System.out.println("-----------------------------");
        Laptop laptop=new Laptop("Dell","Inspiron",700,1.5  );
        System.out.println(laptop);
        laptop.portable();
        System.out.println("--------------------------------");
        Tv tv=new Tv("ITT","Shaub Lorenz",100);
        System.out.println(tv);
        tv.channelUp();
        System.out.println("-------------------------------");
        System.out.println(iphone.getModel()+" : $"+iphone.getPrice());

    }
}
