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
        LinkedList<Book> bookListInBookStorage = BookStorage.booklist;

        //WHEN
        LinkedList<Book> bookList = customer.seeListOfAllBooks();

        //THEN
        assertEquals(bookList, bookListInBookStorage);
    }

    @Test
    public void shouldListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        Customer customer = new Customer();

        //WHEN
        LinkedList<Book> bookLinkedList = customer.selectMenuOption(MainMenuOption.LISTBOOKS);

        //THEN
        assertEquals(bookLinkedList, BookStorage.booklist);
    }
}