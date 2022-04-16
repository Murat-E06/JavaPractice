package day18_NestedLoop;

public class Triangle2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {//row

            for (int j = 1; j <= i; j++) {//column
                if(j%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }

            }
            System.out.println();

        }

}    }

/*
1
10
101
1010
10101
101010
aproach: 6 rows, 6 colums
patern: odd colums print 1, even 0
 */