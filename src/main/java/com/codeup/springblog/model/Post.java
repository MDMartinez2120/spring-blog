package com.codeup.springblog.model;

import com.codeup.springblog.model.User;
import org.aspectj.apache.bcel.generic.Tag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImages> postImages;

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(
//            name = "post_tag",
//            joinColumns = {@JoinColumn(name = "post_id")},
//            inverseJoinColumns = {@JoinColumn(name = "tag_id")}
//    )
//    private List<Tag> tags;

    public Post() {
    }

    public Post(String title, String description, User user, List<PostImages> postImages) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.postImages = postImages;
    }

    public Post(String title, String description, long id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public Post(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Post(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

//    public Post(List<Tag> tags, String title, String description, User user) {
//        this.title = title;
//        this.description = description;
//        this.user = user;
//        this.tags = tags;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setBody(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PostImages> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImages> postImages) {
        this.postImages = postImages;
    }

//    public List<Tag> getTags() {
//        return tags;
//    }

//    public void setTags(List<Tag> tags) {
//        this.tags = tags;
//    }
}
