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
    private String Title;
    private String Description;
    private Integer runningTime;
    private LocalDate releaseDate;
    
    public Movie() {
    }

    public Movie(String title, String description, Integer runningTime,
                 LocalDate releaseDate) {
        Title = title;
        Description = description;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }

    public Movie(Integer movieId, String title, String description,
                 Integer runningTime, LocalDate releaseDate) {
        this.movieId = movieId;
        Title = title;
        Description = description;
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
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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
