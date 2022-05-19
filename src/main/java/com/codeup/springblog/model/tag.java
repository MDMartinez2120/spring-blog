package com.codeup.springblog.model;

//Many-to-Many Exercise:
//        You will create a many-to-many relationship between posts and tags. Consider that...
//        - “A post may have many tags.”
//        - “A tag may be assigned to many posts.”
//        1. Create a Tag entity class that has the following properties:
//        id (typical primary key annotations)
//        name VARCHAR(50)
//        2. Add the proper many-to-many annotations on both entities (Post and Tag) to properly map the relationship. The “join” table should be called “post_tag” and only contain the foreign keys for post_id and tag_id.
//        3. Seed the tags table with three tags named the following: “Silly”, “Funny”, and “Humor”.
//        4. Seed the post_tag table with one post that has the “Silly” and “Funny” tags and another having the “Humor” and “Funny” tags. In total, you will need to insert four records.
//        5. Create a view that will display the titles of posts with the “Funny” tag (you should see the two titles of the posts with the “Funny” tags).

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tag")
public class tag {
    private long id;
    private String name;

    @ManyToMany(mappedBy = "posts")
    @JoinColumn(name = "post_tag")
    List<Post> posts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public tag(String name, List<Post> posts) {
        this.name = name;
        this.posts = posts;
    }
}
