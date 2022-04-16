package day33_CustomClass_Statics;

public class Circle {

    public double radious, diameter;
    public static double pi;

    static {
        pi = 3.14;
    }

    public Circle(double radious, double diameter) {
        this.radious = radious;
        diameter = 2 * radious;
    }

    public double area() {
        return pi * radious * radious;

    }

    public double perimeter() {
        return  2 * pi * radious;
    }

    public static void printPi() {
        System.out.println("pi number is " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}

/*
Circle Task:
Attributes:
instance: radius, diameter
static: pi
Add a constructor that can set All the fields (instances)
HINT: we only need to know the radius to set the radius & diameter
Actions:
calcArea(): returns the area of Circle
calcPerimeter(): returns the perimeter of Circle
printPi(): displays PI value
toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement
 */
