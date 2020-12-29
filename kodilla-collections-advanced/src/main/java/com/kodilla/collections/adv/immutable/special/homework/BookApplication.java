package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("Alphabet", "Erwin Wagenhofer");
        System.out.println(bookManager.getBooks().size());

        bookManager.createBook("Nowe wychowanie seksualne", "Agnieszka Stein");
        System.out.println(bookManager.getBooks().size());

        bookManager.createBook("Księgi Jakubowe", "Olga Tokarczuk");
        System.out.println(bookManager.getBooks().size());

        bookManager.createBook("Wrzenie","Grzegorz Kramer");
        System.out.println(bookManager.getBooks().size());

        Book b1 = new Book("Alphabet","Erwin Wagenhofer");
        Book b2 = new Book("Alphabet", "Erwin Wagenhofer");
        System.out.println("Compare adreses:" + (b1==b2));
    }
}
