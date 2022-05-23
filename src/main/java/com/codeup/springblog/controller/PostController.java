package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.model.User;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    private final EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
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
        User user = userDao.getById(1L);
        Post post = new Post(title, description, user);
        emailService.prepareAndSend(post, post.getTitle(), post.getDescription());
        postDao.save(post);
        return "redirect:/posts";
    }
}


