package day20_Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[]letters={'j','a','v','a',' ','i','s',' ','f','u','n'};
        for(char letter:letters){
            System.out.print(letter+" ");
        }
        System.out.println();
        String  sentence= new String(letters);
        System.out.println("sentence= "+sentence);


    }
}
