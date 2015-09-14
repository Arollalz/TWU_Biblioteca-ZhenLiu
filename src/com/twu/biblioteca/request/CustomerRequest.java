package com.twu.biblioteca.request;

import com.twu.biblioteca.customer.Customer;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    private Customer customer;

    private MainMenuRequestType type;

    public CustomerRequest(Customer customer, MainMenuRequestType type) {
        this.customer = customer;
        this.type = type;
    }

    public static CustomerRequest listBooks(Customer customer) {
        return new CustomerRequest(customer, MainMenuRequestType.listBooks);
    }

    public static CustomerRequest invalidOption(Customer customer) {
        return new CustomerRequest(customer, MainMenuRequestType.validOption);
    }

    public static CustomerRequest quit(Customer customer) {
        return new CustomerRequest(customer, MainMenuRequestType.quit);
    }

    public static CustomerRequest showOptionList(Customer customer) {
        return new CustomerRequest(customer, MainMenuRequestType.showOptionList);
    }

    public MainMenuRequestType getType() {
        return type;
    }
}
