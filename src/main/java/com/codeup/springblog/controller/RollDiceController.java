package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/roll-dice")
public class RollDiceController {

    @GetMapping
    public String numInfo(){
        return "/roll-dice";
    }

    @GetMapping("/{number}")
    public String diceRoll(@PathVariable int number, Model model){
        int randomNum = (int)Math.floor(Math.random()*(6-1+1)+1);

        String message = "";

        if(randomNum == number){
            message = "You guessed correctly!";
        } else {
            message = "you got it wrong";
        }

        model.addAttribute("number", number);
        model.addAttribute("message", message);
        model.addAttribute("randomNum", randomNum);
        return "/roll-dice";
    }

}
