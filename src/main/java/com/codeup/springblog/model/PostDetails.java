package com.codeup.springblog.model;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class PostDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private boolean isAwesome;

    @Column(columnDefinition = "TEXT")
    private String historyOfPost;

    @Column(columnDefinition = "VARCHAR", length = 255)
    private String topicDescription;

    @OneToOne
    private Post post;
}

//One-to-One Exercise:
//        0. Checkout out to a new clean branch called relationship-practice in your Spring Blog.
//        1. Add PostDetails entity with the following fields:
//        id (typical primary key annotations)
//        isAwesome boolean
//        historyOfPost TEXT
//        topicDescription VARCHAR(255)
//        2. Add the needed annotations to map the one-to-one relationship between Post and PostDetails.
//        3. Seed a couple of entries into the PostDetails and Posts table
//        4. Add a GetMapping method to the PostController that returns a simple view that displays a given post’s historyOfPost detail.
//        post.postDetails.historyOfPost