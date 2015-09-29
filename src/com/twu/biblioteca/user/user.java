package com.twu.biblioteca.user;

/**
 * Created by zhenliu on 9/29/15.
 */
public class User {
    private String name;
    private String address;
    private String phoneNumber;

    public User(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void showUserInformation(){
        System.out.println("Name:"+name+"\n"+"Address:"+address+"\n"+"Phone Number:"+phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
