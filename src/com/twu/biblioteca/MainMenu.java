package com.twu.biblioteca;

import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class MainMenu {
    private static LinkedList<Book> content;
    private static String validOptionSelectedMessage = "Select a valid option!";

    public static void setContent(LinkedList<Book> content) {
        MainMenu.content = content;
    }

    public static LinkedList<Book> getContent() {
        return content;
    }

    public static String getValidOptionSelectedMessage() {
        return validOptionSelectedMessage;
    }
}
