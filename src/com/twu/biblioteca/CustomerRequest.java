package com.twu.biblioteca;

/**
 * Created by zhenliu on 9/14/15.
 */
public class CustomerRequest {
    Customer customer;
    MainMenuOptionRequestType type;

    public CustomerRequest(Customer customer, MainMenuOptionRequestType type) {
        this.customer = customer;
        this.type = type;
    }
}
