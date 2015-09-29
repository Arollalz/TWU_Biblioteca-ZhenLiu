package com.twu.biblioteca.library;

/**
 * Created by zhenliu on 9/29/15.
 */
public class Movie {
    private String name;
    private int year;
    private String director;
    private int rate;

    public Movie(String name, int year, String director, int rate) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRate() {
        return rate;
    }
}
