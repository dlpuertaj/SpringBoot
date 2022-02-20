package com.dlp.mjph.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Movie {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer movieId;

    @Column
    private String title;
    private String description;
    private Integer runningTime;
    private LocalDate releaseDate;
    
    public Movie() {
    }

    public Movie(String title, String description, Integer runningTime,
                 LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }

    public Movie(Integer movieId, String title, String description,
                 Integer runningTime, LocalDate releaseDate) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
