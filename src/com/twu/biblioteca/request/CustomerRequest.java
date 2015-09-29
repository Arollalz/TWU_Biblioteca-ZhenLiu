package com.twu.biblioteca.request;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.Movie;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    private MainMenuRequestType type;
    private Book requestBook;
    private Movie movie;

    public CustomerRequest( MainMenuRequestType type, Book book, Movie movie) {
        this.type = type;
        this.requestBook = book;
        this.movie = movie;
    }

    public static CustomerRequest listBooks(Book book, Movie movie) {
        return new CustomerRequest(MainMenuRequestType.listBooks,book, movie);
    }

    public static CustomerRequest invalidOption(Book book, Movie movie) {
        return new CustomerRequest(MainMenuRequestType.validOption, book, movie);
    }

    public static CustomerRequest quit(Book book, Movie movie) {
        return new CustomerRequest(MainMenuRequestType.quit, book, movie);
    }

    public static CustomerRequest checkOut(Book book, Movie movie) {
        return new CustomerRequest(MainMenuRequestType.checkOut, book, movie);
    }

    public static CustomerRequest returnBookOrMovie(Book book, Movie movie){
        return new CustomerRequest(MainMenuRequestType.returnBook, book, movie);
    }

    public MainMenuRequestType getType() {
        return type;
    }

    public Book getRequestBook() {
        return requestBook;
    }

    public Movie getRequestMovie() {
        return movie;
    }
}
