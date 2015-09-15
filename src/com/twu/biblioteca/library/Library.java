package com.twu.biblioteca.library;

import com.twu.biblioteca.handler.Handlers;
import com.twu.biblioteca.request.CustomerRequest;

import java.util.LinkedList;

public class Library {

    public static LinkedList<Book> listOfAllBooks() {
        return BookStorage.allBookList;
    }
    public static void handleSelectedMenuOptionRequest(CustomerRequest request) {
        Handlers.findRequestHandler(request.getType()).handle(request);
    }

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca!";
    }

}
