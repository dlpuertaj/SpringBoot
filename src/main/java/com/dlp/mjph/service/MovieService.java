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
                .findMovieByTitle(movie.getTitle());

        if (movieInBD.isPresent()){
            throw new IllegalStateException(
                    "Movie already in database!");
        }
        movieRepository.save(movie);
    }

    public void deleteMovieById(Integer movieId) {
        // 1. movie in db ?
        boolean movieExits = movieRepository.existsById(movieId);
        if(!movieExits){
            throw new IllegalStateException(
                    "Movie id does not exists in database!");
        }
        // delete movie
        movieRepository.deleteById(movieId);
    }

    public void updateMovie(Movie movie) {
        Optional<Movie> movieInBD = movieRepository
                .findMovieByTitle(movie.getTitle());

        if (!movieInBD.isPresent()){
            throw new IllegalStateException(
                    "Movie does not exist in database!");
        }

        movieRepository.save(movie);

    }
}
