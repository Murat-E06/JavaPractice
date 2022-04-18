package day36_Inheritance.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle=new Circle(2);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle(4,2);
        System.out.println(rectangle);

        Square square=new Square(4);
        System.out.println(square);
        System.out.println("-----------------------------");
        System.out.println(square.getSide());
        square.setSide(5.5);
        System.out.println(square);



    }
}
