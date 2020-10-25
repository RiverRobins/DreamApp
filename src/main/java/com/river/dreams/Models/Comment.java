package com.river.dreams.Models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Comment {


    private Long id;

    @ManyToOne
    private Dream dream;

    @ManyToOne
    private User user;

}
