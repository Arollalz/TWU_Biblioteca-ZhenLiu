package com.twu.biblioteca.handler;

import com.twu.biblioteca.request.CustomerRequest;

/**
 * Created by zhenliu on 9/14/15.
 */
public interface RequestHandler {
    void handle(CustomerRequest request);
}
