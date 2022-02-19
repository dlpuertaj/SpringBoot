package com.dlp.mjph.config;

import com.dlp.mjph.model.Movie;
import com.dlp.mjph.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfiguration {

    @Autowired
    MovieRepository movieRepository;

    @Bean
    CommandLineRunner commandLineRunner() {
        List<Movie> list = new ArrayList<>();
        return args -> {

            Movie m1 = new Movie("The Lord of the Rings, The Return of the King",
                    "Movie", 2000,
                    LocalDate.now()
            );

            Movie m2 = new Movie("The Godfather",
                    "Movie", 2000,
                    LocalDate.now()
            );

            list.add(m1);
            list.add(m2);
            movieRepository.saveAll(list);
        };


    }
}
