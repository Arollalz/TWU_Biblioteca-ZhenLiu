package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.MovieStorage;
import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/15/15.
 */
public class CheckOutHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        if (request.getRequestBook() != null) {
            BookStorage.allBookList.remove(request.getRequestBook());
            BookStorage.bookUserHashMap.put(request.getRequestBook(),request.getUser());
            System.out.println("Thank you! Enjoy the book.");
     }
        if (request.getRequestMovie() != null) {
            MovieStorage.allMovieList.remove(request.getRequestMovie());
            MovieStorage.movieUserHashMap.put(request.getRequestMovie(),request.getUser());
            System.out.println("Thank you! Enjoy the movie.");
        }
    }
}
