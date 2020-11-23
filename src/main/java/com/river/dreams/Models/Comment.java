package com.river.dreams.Models;

import javax.persistence.*;

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String content;

    @ManyToOne
    private Dream dream;

    @ManyToOne
    private User user;
}
