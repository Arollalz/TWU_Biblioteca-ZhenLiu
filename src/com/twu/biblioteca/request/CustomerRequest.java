package com.twu.biblioteca.request;

import com.twu.biblioteca.customer.Customer;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    private Customer customer;

    private MainMenuOptionRequestType type;

    public CustomerRequest(Customer customer, MainMenuOptionRequestType type) {
        this.customer = customer;
        this.type = type;
    }

    public static CustomerRequest listBooks(Customer customer) {
        return new CustomerRequest(customer, MainMenuOptionRequestType.listBooks);
    }

    public static CustomerRequest invalidOption(Customer customer) {
        return new CustomerRequest(customer, MainMenuOptionRequestType.validOption);
    }

    public MainMenuOptionRequestType getType() {
        return type;
    }

}
