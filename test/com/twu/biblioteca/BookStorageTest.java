package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by zhenliu on 9/14/15.
 */
public class BookStorageTest {
    @Test
    public void shouldHaveBooksInBookStorage() {
        assert(BookStorage.bookList.size() > 0);
    }
}