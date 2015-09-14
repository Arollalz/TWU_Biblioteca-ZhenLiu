package com.twu.biblioteca;

import com.twu.biblioteca.customer.Customer;
import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.BookStorage;
import org.hamcrest.core.IsAnything;
import org.junit.Test;

import java.util.Calendar;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerTest {

    @Test
    public void shouldGetWelcomeMessageWhenACustomerStartBibliotecaApp(){
        //GIVEN
        Customer customer = new Customer();

        //WHEN
        String welcomeMessage = customer.startApp();

        //THEN
        assertEquals(welcomeMessage,"Welcome to Biblioteca!");
    }

    @Test
    public void shouldSeeAListOfAllLibraryBooksWhenACustomerWantTo() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        LinkedList<Book> bookListInBookStorage = BookStorage.bookList;

        //WHEN
        LinkedList<Book> bookList = customer.seeListOfAllBooks();

        //THEN
        assertEquals(bookList, bookListInBookStorage);
    }

    @Test
    public void shouldNotAppearInBookListWhenABookBeCheckedByACustomer() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        Book book = BookStorage.bookList.get(0);

        //WHEN
        //THEN
        assertEquals("Thank you! Enjoy the book.",customer.checkOut(book));
        assertFalse(BookStorage.bookList.contains(book));

    }

    @Test
    public void shouldCheckOutUnsuccessfullyWhenABookIsNotAvailable() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        //THEN
        assertEquals("That book is not available.",customer.checkOut(book));
    }
}