package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping()
//    @ResponseBody <- only use this when you want text to display.
    public String allPosts(Model model) {
        List<Post>allPosts = postDao.findAll();
//        Post newPost1 = new Post("car", "buy this sweet ride", 1);
//        Post newPost2 = new Post("guitar", "buy this busted guitar", 2);
//        List<Post> allPosts = new ArrayList<>();
//        allPosts.add(newPost1);
//        allPosts.add(newPost2);

        model.addAttribute("posts", allPosts);
        return "posts/index";
    }

    @GetMapping("/{id}")
    public String showOneAlbum(@PathVariable long id, Model model){
        model.addAttribute("posts", postDao.getById(id));
        return  "posts/show";
    }

    @GetMapping("/create")
//    @ResponseBody
    public String createPosts(){
        return "posts/create";
    }

    @PostMapping("/create")
    public String createAlbum(@RequestParam(name = "title")String title,@RequestParam(name = "description")String description){
        Post post = new Post(title, description);
        postDao.save(post);
        return "redirect:/posts";
    }


}


