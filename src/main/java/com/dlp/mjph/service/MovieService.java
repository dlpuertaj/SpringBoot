package com.dlp.mjph.service;

import com.dlp.mjph.model.Movie;
import com.dlp.mjph.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public void addNewMovie(Movie movie) {
        Optional<Movie> movieInBD = movieRepository
                .findMovieById(movie.getMovieId());

        if (movieInBD.isPresent()){
            throw new IllegalStateException("Movie id exists in database!");
        }
        movieRepository.save(movie);
    }
}
