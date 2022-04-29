package day43_Abstraction.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle=new Circle(4);
        Square square=new Square(5);
        Rectangle rectangle=new Rectangle(4,6);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);



    }
}
