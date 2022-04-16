package day18_NestedLoop;

public class NumberTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            int value=i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(value+" ");
                value+=5-j;

            }
            System.out.println();

        }

    }}

/*
5 row means outer(i)
5 colums means inner loop(j), but in triangle we use j<=i
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15(+4,+3,+2,+1)

 */