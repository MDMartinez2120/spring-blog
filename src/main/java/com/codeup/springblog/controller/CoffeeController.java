package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    @GetMapping
    public String coffeeInfo(){
        return "/coffee";
    }

    @GetMapping("/{roast}")
    public String coffeeInfo(@PathVariable String roast, Model model){
        model.addAttribute("roast", roast);
        return "/coffee";
    }
}