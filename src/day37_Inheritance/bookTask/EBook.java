package day37_Inheritance.bookTask;

public class EBook extends Book {//EBook IS A Book
    public String size;
    public int pages;

    public EBook(String title, String author, double price, String size, int pages) {
        super(title, "E Book", author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("You can read "+type+" with ipad");
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}

/*
Create a sub class of Book named EBook:
variables:
title, type, author, price, size, pages
Methods: setInfo() readBook() toString()
 */
