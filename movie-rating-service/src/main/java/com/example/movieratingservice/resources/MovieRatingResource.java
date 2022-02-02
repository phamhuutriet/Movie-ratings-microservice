package com.example.movieratingservice.resources;


import com.example.movieratingservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }
}
