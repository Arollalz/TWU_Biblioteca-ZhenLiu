package com.twu.biblioteca.library;

import com.twu.biblioteca.user.User;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BookStorage {
    public static LinkedList<Book> allBookList = new LinkedList<Book>() {{
        {
            add(new Book("book1", "author1", Calendar.getInstance()));
            add(new Book("book2", "author2", Calendar.getInstance()));
        }
    }};
    public static HashMap<Book,User> bookUserHashMap = new HashMap<>();

    public static void printAllBookList() {
        System.out.println("BookName       AuthorName       YearPublished");
        for (Book book: allBookList){
            System.out.println(book.getName()+"          "+book.getAuthorName()+"        " +
                    "     "+book.getYearPublished().get(Calendar.YEAR));
        }
    }
}
