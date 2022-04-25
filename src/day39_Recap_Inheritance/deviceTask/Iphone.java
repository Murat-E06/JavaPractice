package day39_Recap_Inheritance.deviceTask;

public class Iphone extends Phone {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size<=0){
            System.out.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public Iphone( String model, double price, double size) {
        super("Iphone", model, price);
        setSize(size);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" can call "+phoneNumber+" with face time");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + getBrand() +
                ", model='" + getModel() +
                ", price=$" + getPrice() +

                ", size=" + size +
                '}';
    }
}

