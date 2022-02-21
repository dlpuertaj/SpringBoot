package com.dlp.mjph.config;

import com.dlp.mjph.model.Movie;
import com.dlp.mjph.model.MovieGenre;
import com.dlp.mjph.repository.MovieGenreRepository;
import com.dlp.mjph.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository,
                                        MovieGenreRepository movieGenreRepository) {
        List<Movie> list = new ArrayList<>();

        return args -> {
            MovieGenre mg1 = new MovieGenre("Drama");
            MovieGenre mg2 = new MovieGenre("Fantasy");

            movieGenreRepository.save(mg1);
            movieGenreRepository.save(mg2);
            Movie m1 = new Movie("The Lord of the Rings, The Return of the King",
                    "Movie", 2000,
                    LocalDate.now(),
                    mg2
            );

            Movie m2 = new Movie("The Godfather",
                    "Movie", 2000,
                    LocalDate.now(),
                    mg1
            );

            list.add(m1);
            list.add(m2);
            movieRepository.saveAll(list);
        };
    }
}
