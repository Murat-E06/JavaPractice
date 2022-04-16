package day18_NestedLoop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {//i=1 için 10 kez çavrim yaptırıyor alt satıra geçipi=2 için aynısını yapıyor. taki i=10 a kadar.
                System.out.print(i*j+"\t");
            }
            System.out.println();
            }
        }
    }

