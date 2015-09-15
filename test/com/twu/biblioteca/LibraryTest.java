package com.twu.biblioteca;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.Library;
import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.MainMenu;
import com.twu.biblioteca.request.CustomerRequest;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/14/15.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LibraryTest {
    public Book book;

    @Before
    public void setUp() throws Exception {
        book = BookStorage.allBookList.get(0);
    }

    @Test
    public void should02ListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.listBooks(book);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals(MainMenu.getContent(),BookStorage.allBookList);
    }

    @Test
    public void should05GetWelcomeMessageWhenACustomerStartBibliotecaApp(){

        assertEquals(Library.showWelcomeMessage(),"Welcome to Biblioteca!");
    }

    @Test
    public void should06SeeAListOfAllLibraryBooksWhenACustomerWantTo() throws Exception {
        //GIVEN
        LinkedList<Book> bookListInBookStorage = BookStorage.allBookList;

        //WHEN and THEN
        assertEquals(Library.listOfAllBooks(), bookListInBookStorage);
    }

    @Test
    public void should07NotAppearInBookListAndGiveAMessageWhenABookBeCheckedByACustomer() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.checkOut(book);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
       // assertEquals("Thank you! Enjoy the book.", MainMenu.getContent());
        assertFalse(BookStorage.allBookList.contains(book));
        assertTrue(BookStorage.lentBookList.contains(book));
    }

    @Test
    public void should08CheckOutUnsuccessfullyAndGiveAMessageWhenABookIsNotAvailable() throws Exception {
        //GIVEN
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        CustomerRequest customerRequest = CustomerRequest.checkOut(book);
        Library.handleSelectedMenuOptionRequest(customerRequest);
        //THEN
        assertFalse(BookStorage.allBookList.contains(book));
       // assertEquals("That book is not available.", customer.checkOut(book));
    }

    @Test
    public void should09AppearInBookListAndGiveAMessageWhenABookBeReturnedByACustomer() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.returnBook(book);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //WHEN and THEN
       // assertEquals("Thank you for returning the book.", customer.returnBook(book));
        assertTrue(BookStorage.allBookList.contains(book));
    }

    @Test
    public void should10ReturnBookUnsuccessfullyAndGiveAMessageWhenABookNotBelongToThisLibray() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.checkOut(book);
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //WHEN and THEN
        assertFalse(BookStorage.allBookList.contains(book));
       // assertEquals("That is not a valid book to return.", customer.returnBook(book));
    }

}