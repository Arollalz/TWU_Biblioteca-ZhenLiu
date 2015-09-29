package com.twu.biblioteca.library;

import com.twu.biblioteca.library.Book;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/14/15.
 */
public class BookTest {
    @Test
    public void shouldHaveBookDetailsIncludingAuthorAndYearPublishedWhenABookBeCreated() {
        //GIVEN and WHEN
        Book book = new Book("book1","author1", Calendar.getInstance());

        //THEN
        assertNotNull(book.getName());
        assertNotNull(book.getAuthorName());
        assertNotNull(book.getYearPublished());
    }
}