package com.codeup.springblog.model;

public class Post {
    private int id;
    private String title;
    private String body;

    public Post(String title, String body, int id) {
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
