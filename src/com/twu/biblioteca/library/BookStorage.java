package com.twu.biblioteca.library;

import java.util.ArrayDeque;
import java.util.Calendar;
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
    public static LinkedList<Book> lentBookList = new LinkedList<>();
}
