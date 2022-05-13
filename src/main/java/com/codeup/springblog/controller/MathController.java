package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
        @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOneHundred(@PathVariable int number){
        return number + " + 100 = " + (number + 100);
    }

//    @GetMapping("{name1}/to/{name2}")
//    @ResponseBody
//    public String oneGreetsAnother(@PathVariable String name1, @PathVariable String name2){
//        return name1 + " says hello to " + name2 + "!";
//    }

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int addTwoNumbers(@PathVariable int num1, @PathVariable int num2){
            return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/and/{num2}")
    @ResponseBody
    public int subTwoNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multTwoNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/and/{num2}")
    @ResponseBody
    public double divTwoNumbers(@PathVariable double num1, @PathVariable double num2){
        return num1 / num2;
    }
}
