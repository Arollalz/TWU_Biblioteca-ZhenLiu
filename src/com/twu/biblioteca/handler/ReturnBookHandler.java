package com.twu.biblioteca.handler;

import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/15/15.
 */
public class ReturnBookHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        if (!BookStorage.allBookList.contains(request.getRequestBook())
                && BookStorage.lentBookList.contains(request.getRequestBook())){
            BookStorage.allBookList.add(request.getRequestBook());
            BookStorage.lentBookList.remove(request.getRequestBook());
            System.out.println("Thank you for returning the book.");
        }else{
            System.out.println("That is not a valid book to return.");
        }
    }
}
