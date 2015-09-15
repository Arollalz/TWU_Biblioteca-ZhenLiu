package com.twu.biblioteca.request;

import com.twu.biblioteca.library.Book;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    private MainMenuRequestType type;
    private Book requestBook;

    public CustomerRequest( MainMenuRequestType type, Book book) {
        this.type = type;
        this.requestBook = book;
    }

    public static CustomerRequest listBooks(Book book) {
        return new CustomerRequest(MainMenuRequestType.listBooks,book);
    }

    public static CustomerRequest invalidOption(Book book) {
        return new CustomerRequest(MainMenuRequestType.validOption, book);
    }

    public static CustomerRequest quit(Book book) {
        return new CustomerRequest(MainMenuRequestType.quit, book);
    }

    public static CustomerRequest checkOut(Book book) {
        return new CustomerRequest(MainMenuRequestType.checkOut, book);
    }

    public static CustomerRequest returnBook(Book book){
        return new CustomerRequest(MainMenuRequestType.returnBook, book);
    }

    public MainMenuRequestType getType() {
        return type;
    }

    public Book getRequestBook() {
        return requestBook;
    }
}
