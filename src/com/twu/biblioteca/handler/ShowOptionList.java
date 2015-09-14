package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.MainMenu;

/**
 * Created by zhenliu on 9/14/15.
 */
public class ShowOptionList implements RequestHandler {
    @Override
    public void handle() {
        MainMenu.setStatus(true);
    }
}
