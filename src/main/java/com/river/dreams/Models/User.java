package com.river.dreams.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.ArrayList;

public class User {

    private Long id;

    @Column(length = 60, unique = true)
    private String username;

    @JsonIgnore
    @Column
    private String password;

    @Column(columnDefinition = "text")
    private String bio;

    private String profilePicture;

    @OneToMany(mappedBy = "user")
    private ArrayList<Dream> dreams;

    @OneToMany(mappedBy = "user")
    private ArrayList<Comment> comments;

}
