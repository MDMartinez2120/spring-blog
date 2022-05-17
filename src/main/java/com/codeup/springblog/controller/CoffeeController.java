//package com.codeup.springblog.controller;
//
//import com.codeup.springblog.model.Coffee;
//import com.codeup.springblog.repositories.CoffeeRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Locale;
//
//@Controller
//@RequestMapping("/coffee")
//public class CoffeeController {
//
//    private final CoffeeRepository coffeeDao;
//
//    public CoffeeController(CoffeeRepository coffeeDao){
//        this.coffeeDao = coffeeDao;
//    }
//
//    public String allCoffees(){
//        return "coffees/index";
//    }
//
//    @GetMapping
//    public String coffeeInfo(){
//        return "/coffee";
//    }
//
//    @GetMapping("/{roast}")
//    public String coffeeInfo(@PathVariable String roast, Model model){
//        model.addAttribute("roast", roast);
//        return "/coffee";
//    }
//
//    @GetMapping("/new")
//    public String addCoffeeForm(){
//        return "coffees/new";
//    }
//
//    @PostMapping("/new")
//    public String addCoffee(@RequestParam(name = "brand") String brand, @RequestParam(name = "roast") String roast, @RequestParam(name = "origin") String origin){
//        Coffee coffee = new Coffee(roast, origin, brand);
//        coffeeDao.save(coffee);
//        return "coffees/new";
//    }
//}
