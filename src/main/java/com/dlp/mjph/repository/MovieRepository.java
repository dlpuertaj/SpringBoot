package com.dlp.mjph.repository;

import com.dlp.mjph.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

    //@Query("SELECT m FROM Movie m WHERE m.movieId = ?1")
    Optional<Movie> findMovieById(Integer movieId);
}
