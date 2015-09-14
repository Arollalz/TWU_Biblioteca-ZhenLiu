package com.twu.biblioteca.library;

import com.twu.biblioteca.handler.Handlers;
import com.twu.biblioteca.request.CustomerRequest;

public class BibliotecaApp {
    public static void handleSelectedMenuOptionRequest(CustomerRequest request){
        Handlers.findRequestHandler(request.getType()).handle();
    }
}
