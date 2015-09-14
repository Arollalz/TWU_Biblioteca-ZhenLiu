package com.twu.biblioteca;

import com.twu.biblioteca.customer.Customer;
import com.twu.biblioteca.library.BibliotecaApp;
import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.MainMenu;
import com.twu.biblioteca.request.CustomerRequest;
import com.twu.biblioteca.request.MainMenuOptionRequestType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BibliotecaAppTest {
    @Test
    public void shouldListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.listBooks(new Customer());

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals(MainMenu.getContent(), BookStorage.bookList);
    }


    @Test
    public void shouldBeNotifiedSelectingAValidOptionWhenACustomerSelectAValidMenuOption() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = CustomerRequest.invalidOption(new Customer());

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals("Select a valid option!",MainMenu.getValidOptionSelectedMessage());
    }
}