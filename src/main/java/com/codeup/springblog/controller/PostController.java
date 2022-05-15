package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {
    @GetMapping()
    @ResponseBody
    public String allPosts() {
        return "This is where you would view all the posts";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String showOneAlbum(@PathVariable long id){
        return "this is where you would view one album, with the id " + id;
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


