package com.twu.biblioteca;

import com.twu.biblioteca.customer.Customer;
import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.BookStorage;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhenliu on 9/14/15.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerTest {
    public Book book;
    @Before
    public void setUp() throws Exception {
        book = BookStorage.allBookList.get(0);
    }

    @Test
    public void should1GetWelcomeMessageWhenACustomerStartBibliotecaApp(){
        //GIVEN
        Customer customer = new Customer();

        //WHEN
        String welcomeMessage = customer.startApp();

        //THEN
        assertEquals(welcomeMessage,"Welcome to Biblioteca!");
    }

    @Test
    public void should2SeeAListOfAllLibraryBooksWhenACustomerWantTo() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        LinkedList<Book> bookListInBookStorage = BookStorage.allBookList;

        //WHEN
        LinkedList<Book> bookList = customer.seeListOfAllBooks();

        //THEN
        assertEquals(bookList, bookListInBookStorage);
    }

    @Test
    public void should3NotAppearInBookListAndGiveAMessageWhenABookBeCheckedByACustomer() throws Exception {
        //GIVEN
        Customer customer = new Customer();

        //WHEN
        //THEN
        assertEquals("Thank you! Enjoy the book.", customer.checkOut(book));
        assertFalse(BookStorage.allBookList.contains(book));
        assertTrue(BookStorage.lentBookList.contains(book));
    }

    @Test
    public void should4CheckOutUnsuccessfullyAndGiveAMessageWhenABookIsNotAvailable() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        //THEN
        assertFalse(BookStorage.allBookList.contains(book));
        assertEquals("That book is not available.", customer.checkOut(book));
    }

    @Test
    public void should5AppearInBookListAndGiveAMessageWhenABookBeReturnedByACustomer() throws Exception {
        //GIVEN
        Customer customer = new Customer();

        //WHEN
        customer.checkOut(book);
        //THEN
        assertEquals("Thank you for returning the book.", customer.returnBook(book));
        assertTrue(BookStorage.allBookList.contains(book));
    }


    @Test
    public void should6ReturnBookUnsuccessfullyAndGiveAMessageWhenABookNotBelongToThisLibray() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        //THEN
        assertEquals("That is not a valid book to return.", customer.returnBook(book));
    }

}