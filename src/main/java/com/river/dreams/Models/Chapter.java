package com.river.dreams.Models;

import org.w3c.dom.Text;

import javax.persistence.*;

public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer number;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column
    private Boolean hidden;

    @ManyToOne
    @JoinColumn(name = "dream_id", insertable = false, updatable = false)
    private Dream dream;

}
