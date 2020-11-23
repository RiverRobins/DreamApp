package com.river.dreams.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60, unique = true)
    private String username;

    @JsonIgnore
    @Column
    private String password;

    @Column(length = 1024)
    private String bio;

    @Column(columnDefinition = "text")
    private String profilePicture;

    @OneToMany(mappedBy = "user")
    private ArrayList<Dream> dreams;

    @OneToMany(mappedBy = "user")
    private ArrayList<Comment> comments;

}
