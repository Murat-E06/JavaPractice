package day39_Recap_Inheritance.deviceTask;

public class Tv extends Device{


    public Tv(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" is channeling up");
    }
}
/*
Create a sub class of Device named TV:
Extra Methods:
channelUp()
channelDown()
 */