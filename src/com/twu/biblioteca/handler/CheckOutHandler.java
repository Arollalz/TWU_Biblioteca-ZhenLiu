package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/15/15.
 */
public class CheckOutHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        if ((request.getRequestBook() == null )|| (!BookStorage.allBookList.contains(request.getRequestBook()))){
            System.out.println("That book is not available.");
        } else {
            BookStorage.allBookList.remove(request.getRequestBook());
            BookStorage.lentBookList.add(request.getRequestBook());
            System.out.println("Thank you! Enjoy the book.");
        }
    }
}
