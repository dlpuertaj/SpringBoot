package com.dlp.mjph.repository;

import com.dlp.mjph.model.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieGenreRepository extends JpaRepository<MovieGenre,Integer> {
}
