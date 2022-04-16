package day37_Inheritance.bookTask;

public class AudioBook extends Book {
    public String length, narrator;

    public AudioBook(String title, String author, double price, String length, String narrator) {
        super(title, "Audio Book", author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("You can read a book to listennig "+type);
    }

    public String toString() {
        return "AudioBook{" +

                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
Create a sub class of Book named AudioBook:
variables:
title, type, author, price, length, narrator
Methods:
setInfo() listen() toString()
 */
