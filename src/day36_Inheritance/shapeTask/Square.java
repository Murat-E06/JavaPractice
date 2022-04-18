package day36_Inheritance.shapeTask;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.out.println("Invalid side "+side);
            System.exit(1);//1 means somethting went wrong. 0 means everything normal
        }
        this.side = side;
    }

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
variables:
side;
Encapsulate the field
Add a constructor to set the filed
area(): side * side
perimeter(): side * 4
toString(): side, area, perimeter
 */