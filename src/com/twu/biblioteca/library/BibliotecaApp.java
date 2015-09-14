package com.twu.biblioteca.library;

import com.twu.biblioteca.handler.Handlers;
import com.twu.biblioteca.request.CustomerRequest;
import com.twu.biblioteca.request.MainMenuRequestType;

public class BibliotecaApp {
    public static void handleSelectedMenuOptionRequest(CustomerRequest request) {
        if (MainMenu.getStatus() || (request.getType() == MainMenuRequestType.showOptionList)) {
            Handlers.findRequestHandler(request.getType()).handle();
        }
    }
}
