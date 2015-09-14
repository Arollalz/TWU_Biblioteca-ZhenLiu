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
        return BookStorage.allBookList;
    }

    public String checkOut(Book book) {
        if (!BookStorage.allBookList.contains(book)){
            return "That book is not available.";
        } else {
            BookStorage.allBookList.remove(book);
            BookStorage.lentBookList.add(book);
            return "Thank you! Enjoy the book.";
        }
    }

    public String returnBook(Book book) {
        if (!BookStorage.allBookList.contains(book)
                && BookStorage.lentBookList.contains(book)){
            BookStorage.allBookList.add(book);
            BookStorage.lentBookList.remove(book);
            return "Thank you for returning the book.";
        }else{
            return "That is not a valid book to return.";
        }
    }
}
