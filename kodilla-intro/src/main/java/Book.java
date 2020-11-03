import com.sun.jdi.PathSearchingVirtualMachine;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class Book {
    private String author;
    private String title;
    private static Book book;

    private Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;

    }
    public static void main(String[] args) {
        Book book = Book.of("Stephen King", "Mercedes");
        System.out.println(book);
    }

    private static Book of(String author, String title) {
        return new Book(author, title);



    }


    }

