package com.twu.biblioteca;

import java.util.HashMap;

/**
 * Created by zhenliu on 9/14/15.
 */
public final class Handlers {
    private static final HashMap<MainMenuOptionRequestType, RequestHandler> optionRequestHandlerMap = new HashMap<MainMenuOptionRequestType, RequestHandler>(){{
        put(MainMenuOptionRequestType.listBooks, new ListBooksHandler());
        put(MainMenuOptionRequestType.validOption, new ValidOptionHandler());
    }};

    public static RequestHandler findRequestHandler(MainMenuOptionRequestType mainMenuOptionRequestType) {
        return optionRequestHandlerMap.get(mainMenuOptionRequestType);
    }
}
