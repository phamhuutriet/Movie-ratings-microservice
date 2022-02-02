package com.example.movieinfoservice.models;

import lombok.Getter;
import lombok.Setter;

public class Movie {

    @Getter @Setter private int movieId;
    @Getter @Setter private String name;

    public Movie(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
}
