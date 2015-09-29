package com.twu.biblioteca.library;

import org.junit.Test;


/**
 * Created by zhenliu on 9/14/15.
 */
public class BookStorageTest {
    @Test
    public void shouldHaveBooksInBookStorage() {
        assert(BookStorage.allBookList.size() > 0);
    }
}