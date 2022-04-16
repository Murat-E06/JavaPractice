package day17_WhileDoWhile;

public class WithoutOperators {
    public static void main(String[] args) {
        int n1=13,n2=4;
        int division=0;

       /*
        for (int i = n1; i >=n2 ; i-=n2) {

            n1-=n2;
            division++;
            if(n1<n2){
                System.out.println("division = " + division);
                System.out.println("reminder: "+n1);
            }
            
        }
          */
        while (n1>=n2){
            n1-=n2;
            division++;
        }
        System.out.println("division: "+division+" remaider: "+n1);

        
    }
}
