package com.twu.biblioteca.library;

import java.util.LinkedList;

/**
 * Created by zhenliu on 9/29/15.
 */
public class MovieStorage {
    public static LinkedList<Movie> allMovieList = new LinkedList<Movie>() {{
        {
            add(new Movie("movie1", 1990,"director1",1));
            add(new Movie("movie2", 2015,"director2",5));
        }
    }};
    public static LinkedList<Movie> lentMovieList = new LinkedList<>();

    public static void printAllMovieList() {
        System.out.println("MovieName       Year             Director        Rate ");
        for (Movie movie: allMovieList){
            System.out.println(movie.getName() + "          " + movie.getYear() + "        " +
                    "     " + movie.getDirector() + "         "+movie.getRate());
        }
    }
}
