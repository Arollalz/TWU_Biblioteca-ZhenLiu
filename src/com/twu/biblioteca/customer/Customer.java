package com.twu.biblioteca.customer;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.BookStorage;

import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class Customer {

    public String startApp(){
        return "Welcome to Biblioteca!";
    }

    public LinkedList<Book> seeListOfAllBooks() {
        return BookStorage.bookList;
    }
}
