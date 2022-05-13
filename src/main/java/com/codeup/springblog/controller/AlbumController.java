package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/albums")
public class AlbumController {
    @GetMapping
    @ResponseBody
    public String allAlbums(){
        return "This is where you would view all the albums";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String showOneAlbum(@PathVariable long id){
        return "this is where you would view one album, with the id " + id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createAlbumsFrom(){
        return "this is where you can view a form to create an album in the database";
    }

    @PostMapping
    @ResponseBody
    public String createAlbum(){
        return "this is where the logic would be for when the crate albums form is submitted.";
    }

}
