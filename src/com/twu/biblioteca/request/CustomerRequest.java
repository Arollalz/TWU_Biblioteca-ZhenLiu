package com.twu.biblioteca.request;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.Movie;
import com.twu.biblioteca.user.User;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    private User user;
    private MainMenuRequestType type;
    private Book requestBook;
    private Movie movie;

    public CustomerRequest( User user, MainMenuRequestType type, Book book, Movie movie) {
        this.user = user;
        this.type = type;
        this.requestBook = book;
        this.movie = movie;
    }

    public static CustomerRequest listBooks(User user,Book book, Movie movie) {
        return new CustomerRequest(user,MainMenuRequestType.listBooks,book, movie);
    }

    public static CustomerRequest invalidOption(User user,Book book, Movie movie) {
        return new CustomerRequest(user, MainMenuRequestType.validOption, book, movie);
    }

    public static CustomerRequest quit(User user, Book book, Movie movie) {
        return new CustomerRequest(user, MainMenuRequestType.quit, book, movie);
    }

    public static CustomerRequest checkOut(User user, Book book, Movie movie) {
        return new CustomerRequest(user,MainMenuRequestType.checkOut, book, movie);
    }

    public static CustomerRequest returnBookOrMovie(User user,Book book, Movie movie){
        return new CustomerRequest(user,MainMenuRequestType.returnBook, book, movie);
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

    public User getUser() {
        return user;
    }
}
