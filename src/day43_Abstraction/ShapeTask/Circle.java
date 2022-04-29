package day43_Abstraction.ShapeTask;

public final class Circle extends Shape {
    private double radius;
    static double pi;

    static {
        pi=3.14;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius "+radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
/*
Circle:
area(): r * r * pi
perimeter(): 2 * r * pi
 */