package com.twu.biblioteca;

import java.util.Calendar;

/**
 * Created by zhenliu on 9/14/15.
 */
public class Book {
    private String name;
    private String authorName;
    private Calendar yearPublished = Calendar.getInstance();

    public Book(String name, String authorName, Calendar yearPublished) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public Calendar getYearPublished() {
        return yearPublished;
    }

    public String getAuthorName() {
        return authorName;
    }
}
