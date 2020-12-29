package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager{
    private List<Book>books = new ArrayList<>();

    public void createBook(String title,String author){
        System.out.println("createBook :" + title);
        Book book = new Book(title,author);
        if (!exist(book)){
            books.add(book);
        }
    }
    private boolean exist(Book book) {
        return books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}
