package com.rxjava2.android.samples.model;

/**
 * Created by linh918 on 11/23/17.
 */

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
