package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by zhenliu on 9/14/15.
 */
public class WelcomeMessageTestTest {

    @Test
    public void shouldGetWelcomeMessageWhenACustomerStartBibliotecaApp(){
        //Given
        Customer customer = new Customer();

        //When
        String welcomeMessage = customer.startApp();

        //Then
        assertEquals(welcomeMessage,"Welcome to Biblioteca!");
    }

}