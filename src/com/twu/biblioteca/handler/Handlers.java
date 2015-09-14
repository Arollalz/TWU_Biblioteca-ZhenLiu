package com.twu.biblioteca.handler;

import com.twu.biblioteca.request.MainMenuOptionRequestType;

import java.util.HashMap;

/**
 * Created by zhenliu on 9/14/15.
 */
public final class Handlers {
    private static final HashMap<MainMenuOptionRequestType, RequestHandler> optionRequestHandlerMap = new HashMap<MainMenuOptionRequestType, RequestHandler>(){{
        put(MainMenuOptionRequestType.listBooks, new ListBooksHandler());
        put(MainMenuOptionRequestType.validOption, new InvalidOptionHandler());
    }};

    public static RequestHandler findRequestHandler(MainMenuOptionRequestType mainMenuOptionRequestType) {
        return optionRequestHandlerMap.get(mainMenuOptionRequestType);
    }
}
