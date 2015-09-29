package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.MovieStorage;
import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/15/15.
 */
public class ReturnBookOrMovieHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        if (request.getRequestBook() != null) {
            if (!BookStorage.allBookList.contains(request.getRequestBook())
                    && BookStorage.lentBookList.contains(request.getRequestBook())){
                BookStorage.allBookList.add(request.getRequestBook());
                BookStorage.lentBookList.remove(request.getRequestBook());
                System.out.println("Thank you for returning the book.");
            }else{
                System.out.println("That is not a valid book to return.");
            }
        }

        if (request.getRequestMovie() != null) {
            if (!MovieStorage.allMovieList.contains(request.getRequestMovie())
                    && MovieStorage.lentMovieList.contains(request.getRequestMovie())){
                MovieStorage.allMovieList.add(request.getRequestMovie());
                MovieStorage.lentMovieList.remove(request.getRequestMovie());
                System.out.println("Thank you for returning the movie.");
            }else{
                System.out.println("That is not a valid movie to return.");
            }
        }


    }

}
