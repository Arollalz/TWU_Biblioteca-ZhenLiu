package com.twu.biblioteca;

import java.util.Calendar;
import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BookStorage {
    public static LinkedList<Book> booklist = new LinkedList<Book>() ;

    public BookStorage() {
        initBookList();
    }
    private static void initBookList(){
        {
            booklist.add(new Book("book1","author1", Calendar.getInstance()));
            booklist.add(new Book("book2","author2",Calendar.getInstance()));
        }
    }
}
