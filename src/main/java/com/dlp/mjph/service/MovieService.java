package com.dlp.mjph.service;

import com.dlp.mjph.model.Movie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        List<Movie> list = new ArrayList<>();
        Movie movie = new Movie("The Lord of the Rings",
                "Movie", 2000,
                LocalDate.now()
        );
        list.add(movie);

        return list;
    }
}
