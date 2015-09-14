package com.twu.biblioteca.library;

import java.util.LinkedList;

/**
 * Created by zhenliu on 9/14/15.
 */
public class MainMenu {
    private static boolean status = false;
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

    public static void setStatus(boolean status) {
        MainMenu.status = status;
    }

    public static boolean getStatus() {
        return status;
    }

}
