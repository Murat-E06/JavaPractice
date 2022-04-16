package day31_Constructors;

public class Carpet {

    public double width, length, unitePrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitePrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitePrice = unitePrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {//eğer haricten girdiye iht. olsaydı () içinde tanımlayacaktık!! burada iht.olmadığı için boş
        double totalCost = width * length * unitePrice;
        if (isPersian) {
            totalCost += 200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitePrice= $" + unitePrice +
                ", isPersian=" + isPersian +
                ", Total cost of the carpet= $" + calcCost() +//metodun içinde metod kullanılabilir!!
                '}';
    }
}

/*
Carpet Task:
5.1create a custom class for the Carpet class that should contain the following:
 instance variables:   width, length, unitPrice, isPersian (boolean)
 Add a constructor to set all the instances instance methods:
    calcCost(): should be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including the total cost of the carpet
                as calculated by calcCost()
total price of carpet = (width*length)*unitprice
if the carpet is persian  carpet, add 200$ to the totalPrice
 */