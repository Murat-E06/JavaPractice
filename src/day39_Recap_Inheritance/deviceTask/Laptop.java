package day39_Recap_Inheritance.deviceTask;

public class Laptop extends Computer{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<=0){
            System.out.println("Invalid weight");
        }
        this.weight = weight;
    }

    public Laptop(String brand, String model, double price, double weight) {
        super(brand, model, price);
        setWeight(weight);
    }

    public void portable(){
        System.out.println(getBrand()+" "+getModel()+" laptop is portable");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + getBrand() +
                ", model='" + getModel() +
                ", price=$" + getPrice() +
                ", weight=" + weight +
                '}';
    }
}
