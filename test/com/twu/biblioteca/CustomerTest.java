package com.twu.biblioteca;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerTest {

    @Test
    public void shouldGetWelcomeMessageWhenACustomerStartBibliotecaApp(){
        //Given
        Customer customer = new Customer();

        //When
        String welcomeMessage = customer.startApp();

        //Then
        assertEquals(welcomeMessage,"Welcome to Biblioteca!");
    }

    @Test
    public void shouldSeeAListOfAllLibraryBooksWhenACustomerWantTo() throws Exception {
        //Given
        Customer customer = new Customer();
        LinkedList<Book> bookListInBookStorage = BookStorage.booklist;

        //When
        LinkedList<Book> bookList = customer.seeListOfAllBooks();

        //Then
        assertEquals(bookList, bookListInBookStorage);
    }
}