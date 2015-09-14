package com.twu.biblioteca;

public class BibliotecaApp {
    public static void handleSelectedMenuOptionRequest(CustomerRequest request){
        Handlers.findRequestHandler(request.type).handle();
    }
}
