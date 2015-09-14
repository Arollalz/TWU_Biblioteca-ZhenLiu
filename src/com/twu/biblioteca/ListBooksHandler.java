package com.twu.biblioteca;

/**
 * Created by zhenliu on 9/14/15.
 */
public class ListBooksHandler implements RequestHandler{
    @Override
    public void handle() {
        MainMenu.setContent(BookStorage.bookList);
    }
}
