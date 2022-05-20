//package com.codeup.springblog.model;
//
////Many-to-Many Exercise:
////        You will create a many-to-many relationship between posts and tags. Consider that...
////        - “A post may have many tags.”
////        - “A tag may be assigned to many posts.”
////        1. Create a Tag entity class that has the following properties:
////        id (typical primary key annotations)
////        name VARCHAR(50)
////        2. Add the proper many-to-many annotations on both entities (Post and Tag) to properly map the relationship. The “join” table should be called “post_tag” and only contain the foreign keys for post_id and tag_id.
////        3. Seed the tags table with three tags named the following: “Silly”, “Funny”, and “Humor”.
////        4. Seed the post_tag table with one post that has the “Silly” and “Funny” tags and another having the “Humor” and “Funny” tags. In total, you will need to insert four records.
////        5. Create a view that will display the titles of posts with the “Funny” tag (you should see the two titles of the posts with the “Funny” tags).
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "tags")
//class Tag {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(nullable = false, length = 50)
//    private String name;
//
//    @ManyToMany(mappedBy="tags")
//    private List<Post> posts;
//
//    public Tag(){}
//
//    public Tag(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Tag(String name) {
//        this.name = name;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Post> posts) {
//        this.posts = posts;
//    }
//}
