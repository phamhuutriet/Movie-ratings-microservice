package com.example.moviecatalogservice.models;

import lombok.Getter;
import lombok.Setter;

public class Rating {

    @Getter @Setter String movieId;
    @Getter @Setter int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
