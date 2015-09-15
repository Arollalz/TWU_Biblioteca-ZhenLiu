package com.twu.biblioteca.handler;

import com.twu.biblioteca.request.MainMenuRequestType;

import java.util.HashMap;

/**
 * Created by zhenliu on 9/14/15.
 */
public final class Handlers {
    private static  HashMap<MainMenuRequestType, RequestHandler> optionRequestHandlerMap = new HashMap<MainMenuRequestType, RequestHandler>(){{
        put(MainMenuRequestType.listBooks, new ListBooksHandler());
        put(MainMenuRequestType.validOption, new InvalidOptionHandler());
        put(MainMenuRequestType.quit,new QuitOptionHandler());
        put(MainMenuRequestType.checkOut,new CheckOutHandler());
        put(MainMenuRequestType.returnBook,new ReturnBookHandler());
    }};

    public static RequestHandler findRequestHandler(MainMenuRequestType mainMenuRequestType) {
        return optionRequestHandlerMap.get(mainMenuRequestType);
    }
}
