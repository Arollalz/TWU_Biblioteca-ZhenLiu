package com.twu.biblioteca;

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
            booklist.add(new Book("book1"));
            booklist.add(new Book("book2"));
        }
    }
}
