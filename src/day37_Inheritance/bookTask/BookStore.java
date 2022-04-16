package day37_Inheritance.bookTask;

import java.util.ArrayList;

public class BookStore {

        public EBook EB;
        public AudioBook AB;

        public BookStore(EBook EB, AudioBook AB) {
                this.EB = EB;
                this.AB = AB;
        }

        public String toString() {
                return "BookStore{" +
                        "EBook=" + EB.title +", "+ EB.author +
                        ", ABook=" + AB.title +", "+AB.author+
                        '}';
        }


        public static void main(String[] args) {


        EBook eBook=new EBook("Adventure","Jules Verne",25,"Large",250);
        System.out.println(eBook);
        eBook.readBook();

        AudioBook audioBook=new AudioBook("Drama","Shakespeare",50,"Long","Good");
        System.out.println(audioBook);
        audioBook.listen();

        BookStore bookStore=new BookStore(eBook,audioBook);
                System.out.println(bookStore);











    }
}
