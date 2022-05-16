package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    @GetMapping()
//    @ResponseBody <- only use this when you want text to display.
    public String allPosts(Model model) {
        Post newPost1 = new Post("car", "buy this sweet ride", 1);
        Post newPost2 = new Post("guitar", "buy this busted guitar", 2);
        List<Post> allPosts = new ArrayList<>();
        allPosts.add(newPost1);
        allPosts.add(newPost2);

        model.addAttribute("posts", allPosts);
        return "posts/index";
    }

    @GetMapping("/{id}")
//    @ResponseBody
    public String showOneAlbum(@PathVariable int id){
        return  "posts/index";
    }

    @GetMapping("/create")
    @ResponseBody
    public String createPosts(){
        return "this is where you would create the posts";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createAlbum(){
        return "this is where the logic would be for when the crate a new post.";
    }
}


