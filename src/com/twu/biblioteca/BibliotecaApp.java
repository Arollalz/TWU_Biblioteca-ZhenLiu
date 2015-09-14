package com.twu.biblioteca;

public class BibliotecaApp {
    public static void handleSelectedMenuOptionRequest(MainMenuOptionRequestType mainMenuOptionRequestType){
        Handlers.findRequestHandler(mainMenuOptionRequestType).handle();
    }
}
