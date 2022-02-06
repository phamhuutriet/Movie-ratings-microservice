package com.example.moviecatalogservice.models;

import lombok.Getter;
import lombok.Setter;

public class Movie {

    @Getter @Setter private String movieId;
    @Getter @Setter private String name;

    public Movie() {

    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
}
