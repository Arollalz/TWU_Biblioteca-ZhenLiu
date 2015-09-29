package com.twu.biblioteca.library;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by zhenliu on 9/29/15.
 */
public class MovieTest {
    @Test
    public void shouldReturnDetailsAboutAMovieWhenNewAMovie() throws Exception {
        Movie movie = new Movie("Movie1",1990,"Director1",5);

        assertNotNull(movie.getName());
        assertNotNull(movie.getYear());
        assertNotNull(movie.getDirector());
        assertNotNull(movie.getRate());
    }
}