package com.twu.biblioteca.library;

import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class MainMenu {
    private static LinkedList<Book> content;
    private static final String validOptionSelectedMessage = "Select a valid option!";
    private static final String checkOutSuccessfullyMessage = "Thank you! Enjoy the book.";
    private static final String checkOutFailedMessage = "That book is not available.";
    private static final String returnBookMessage = "";
    private static final String returnFailedMessage = "";

    public static void setContent(LinkedList<Book> content) {
        MainMenu.content = content;
    }

    public static LinkedList<Book> getContent() {
        return content;
    }

    public static String getValidOptionSelectedMessage() {
        return validOptionSelectedMessage;
    }

    public static String getCheckOutSuccessfullyMessage() {
        return checkOutSuccessfullyMessage;
    }

    public static String getCheckOutFailedMessage() {
        return checkOutFailedMessage;
    }

    public static String getReturnBookMessage() {
        return returnBookMessage;
    }

    public static String getReturnFailedMessage() {
        return returnFailedMessage;
    }
}
