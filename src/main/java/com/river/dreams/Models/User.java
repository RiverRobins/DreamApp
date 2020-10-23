package com.river.dreams.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import java.util.ArrayList;

public class User {

    private Long id;

    @Column(length = 60, unique = true)
    private String username;

    @JsonIgnore
    private String password;

    private String bio;

    private String profilePicture;

    private ArrayList<Dream> dreams;

    private ArrayList<Comment> comments;

}
