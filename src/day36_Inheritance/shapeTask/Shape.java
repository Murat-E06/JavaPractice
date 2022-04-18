package day36_Inheritance.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("Name can not be null");
            System.exit(1);
        }
        if(name.isEmpty()||name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public Shape(String name) {// constructor. this i iptal ettik
        setName(name);
    }

    public double area(){//hepsinin alanı farklı ol. icin ayrı ayrı belirleyecegiz
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
              //  "name='" + name + '\'' +
              //  ", area='" + area() + '\'' +//ilave ettik ama diğer klasların ayrı ayrı toString methodları ol.için yazmasak da oluyor
              //  ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
variables:
name
Encapsulate the field
Add a constructor to set the filed
Methods:
area(){}
perimeter(){}
toString
 */
