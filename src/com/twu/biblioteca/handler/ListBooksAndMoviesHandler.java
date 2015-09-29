package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.MainMenu;
import com.twu.biblioteca.library.MovieStorage;
import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/14/15.
 */
public class ListBooksAndMoviesHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        MainMenu.setContent(BookStorage.allBookList);
        BookStorage.printAllBookList();
        MovieStorage.printAllMovieList();
    }
}
