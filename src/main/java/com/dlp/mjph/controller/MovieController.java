package com.dlp.mjph.controller;

import com.dlp.mjph.model.Movie;
import com.dlp.mjph.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/movie")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getSMovies(){
       return movieService.getMovies();
    }

    @PostMapping
    public void saveMovie(@RequestBody Movie movie){
        movieService.addNewMovie(movie);
    }


}
