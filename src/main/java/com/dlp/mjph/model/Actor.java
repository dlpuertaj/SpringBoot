package com.dlp.mjph.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer actorId;

    @Column
    private String fullName;

    //@Column
    //private String genre;

    @ManyToMany
    @JoinTable(name = "actor_movie")
    private Set<Movie> movies;
}
