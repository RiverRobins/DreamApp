package com.river.dreams.Models;

import javax.persistence.*;
import java.util.ArrayList;

public class Dream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String title;

    @Column(length = 2048)
    private String description;

    @Column(length = 2048)
    private String notes;

    @Column
    private Boolean hidden;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chapter")
    private ArrayList<String> chapters = new ArrayList<>();

    private User user;

    private ArrayList<Tags> tags;

    private ArrayList<Comment> comments;


}
