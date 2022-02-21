package com.dlp.mjph.model;

import javax.persistence.*;

@Entity
public class MovieGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Integer genreId;

    @Column
    private String genre;

    public MovieGenre() {
    }

    public MovieGenre(String genre) {
        this.genre = genre;
    }

    public MovieGenre(Integer genreId, String genre) {
        this.genreId = genreId;
        this.genre = genre;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
