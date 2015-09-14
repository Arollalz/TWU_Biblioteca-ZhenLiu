package com.twu.biblioteca;

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
