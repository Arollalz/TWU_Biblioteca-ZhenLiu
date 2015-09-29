package com.twu.biblioteca.library;

import com.twu.biblioteca.request.CustomerRequest;
import com.twu.biblioteca.user.User;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by zhenliu on 9/14/15.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LibraryTest {
    public Book book ;
    public Movie movie ;
    public User user;

    @Before
    public void setUp() throws Exception {
        book = BookStorage.allBookList.get(0);
        movie = MovieStorage.allMovieList.get(0);
        user = new User("test","test","test");
    }

    @Test
    public void A_shouldListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.listBooks(user,book, null);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals(MainMenu.getContent(),BookStorage.allBookList);
    }

    @Test
    public void B_shouldGetWelcomeMessageWhenACustomerStartBibliotecaApp(){

        assertEquals(Library.showWelcomeMessage(),"Welcome to Biblioteca!");
    }

    @Test
    public void C_shouldSeeAListOfAllLibraryBooksWhenACustomerWantTo() throws Exception {
        //GIVEN
        LinkedList<Book> bookListInBookStorage = BookStorage.allBookList;

        //WHEN and THEN
        assertEquals(Library.listOfAllBooks(), bookListInBookStorage);
    }

    @Test
    public void D_shouldNotAppearInBookListAndGiveAMessageWhenABookBeCheckedSuccessfullyByACustomer() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.checkOut(user,book, null);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
       // assertEquals("Thank you! Enjoy the book.", MainMenu.getContent());
        assertFalse(BookStorage.allBookList.contains(book));
        assertTrue(BookStorage.bookUserHashMap.containsKey(book));
    }

    @Test
    public void E_shouldCheckOutUnsuccessfullyAndGiveAMessageWhenABookIsNotAvailable() throws Exception {
        //GIVEN
        Book book = new Book("book3","author3", Calendar.getInstance());

        //WHEN
        CustomerRequest customerRequest = CustomerRequest.checkOut(user,book, null);
        Library.handleSelectedMenuOptionRequest(customerRequest);
        //THEN
        assertFalse(BookStorage.allBookList.contains(book));
       // assertEquals("That book is not available.", customer.checkOut(book));
    }

    @Test
    public void F_shouldAppearInBookListAndGiveAMessageWhenABookBeReturnedByACustomer() throws Exception {
        //GIVEN
        CustomerRequest customerRequest0 = CustomerRequest.checkOut(user,book,null);
        Library.handleSelectedMenuOptionRequest(customerRequest0);
        CustomerRequest customerRequest = CustomerRequest.returnBookOrMovie(user,book, null);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //WHEN and THEN
       // assertEquals("Thank you for returning the book.", customer.returnBookOrMovie(book));
        assertTrue(BookStorage.allBookList.contains(book));
    }

    @Test
    public void G_shouldReturnBookUnsuccessfullyAndGiveAMessageWhenABookNotBelongToThisLibrary() throws Exception {
        //GIVEN
        Book book = new Book("book3","author3", Calendar.getInstance());
        CustomerRequest customerRequest = CustomerRequest.returnBookOrMovie(user,book, null);

        //WHEN
        Library.handleSelectedMenuOptionRequest(customerRequest);

        //WHEN and THEN
        assertFalse(BookStorage.bookUserHashMap.containsKey(book));
       // assertEquals("That is not a valid book to return.", customer.returnBookOrMovie(book));
    }

    @Test
    public void H_should11CheckOutSuccessfullyWhenACustomerCheckOutAnAvailableMovie() throws Exception {
        CustomerRequest customerRequest = CustomerRequest.checkOut(user,null,movie);

        Library.handleSelectedMenuOptionRequest(customerRequest);

        assertFalse(MovieStorage.allMovieList.contains(movie));
        assertTrue(MovieStorage.movieUserHashMap.containsKey(movie));
    }
}