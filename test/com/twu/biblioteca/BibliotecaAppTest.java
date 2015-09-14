package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BibliotecaAppTest {
    @Test
    public void shouldListBooksWhenACustomerSelectListBooksMenuOption() throws Exception {
        //GIVEN
        CustomerRequest customerRequest = new CustomerRequest(new Customer(), MainMenuOptionRequestType.listBooks);

        //WHEN
        BibliotecaApp.handleSelectedMenuOptionRequest(customerRequest);

        //THEN
        assertEquals(MainMenu.getContent(), BookStorage.bookList);
    }
}