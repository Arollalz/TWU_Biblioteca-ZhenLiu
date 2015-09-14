package com.twu.biblioteca;

import com.twu.biblioteca.customer.Customer;
import com.twu.biblioteca.library.BibliotecaApp;
import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.MainMenu;
import com.twu.biblioteca.request.CustomerRequest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BibliotecaAppTest {

    @Test
    public void shouldMenuStatusChangeFromFalseToTrueWhenACustomerChooseShowOptionList() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        assertFalse(MainMenu.getStatus());
        CustomerRequest customerRequest = CustomerRequest.showOptionList(customer);

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertTrue(MainMenu.getStatus());
    }

    @Test
    public void shouldListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        CustomerRequest customerRequest = CustomerRequest.listBooks(customer);

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals(MainMenu.getContent(), BookStorage.allBookList);
    }


    @Test
    public void shouldListBooksWhenACustomerSelectInvalidMenuOption() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        CustomerRequest customerRequest = CustomerRequest.invalidOption(customer);

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals("Select a valid option!",MainMenu.getValidOptionSelectedMessage());
    }

    @Test
    public void shouldChangeTheStatusOfMenuWhenACustomerSelectQuitOption() throws Exception {
        //GIVEN
        Customer customer = new Customer();
        CustomerRequest customerRequest1 = CustomerRequest.invalidOption(customer);
        CustomerRequest customerRequest2= CustomerRequest.quit(customer);

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest1);
        assertTrue(MainMenu.getStatus());
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest2);

        //THEN
        assertFalse(MainMenu.getStatus());
    }
}