package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("Alphabet", "Erwin Wagenhofer");

        bookManager.createBook("Nowe wychowanie seksualne", "Agnieszka Stein");

        bookManager.createBook("Księgi Jakubowe", "Olga Tokarczuk");

        bookManager.createBook("Wrzenie","Grzegorz Kramer");




        Book b1 = new Book("Alphabet","Erwin Wagenhofer");
        Book b2 = new Book("Alphabet", "Erwin Wagenhofer");
        System.out.println("Compare adreses:" + (b1==b2));

    }

}
