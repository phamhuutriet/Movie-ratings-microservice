package com.example.moviecatalogservice.resource;


import com.example.moviecatalogservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userId}")
    public List<Movie> getCatalog(@PathVariable("userId") String userId) {
        return Collections.singletonList(
                new Movie("Harry Potter", "And the goblet of fire", 4)
        );
    }
}
