package com.twu.biblioteca.handler;

import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/14/15.
 */
public class QuitOptionHandler implements RequestHandler {
    @Override
    public void handle(CustomerRequest request) {
        System.out.println("Bye!");
        System.exit(0);
    }
}
