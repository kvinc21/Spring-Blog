package com.example.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {

    @GetMapping("/Hello")
    @ResponseBody
    public String helloWorld(){

        return "This is the landing page!";
    }

    @GetMapping("/birthday")
    public String happyBirthday(
            @PathVariable String username,
            @PathVariable int age,
            Model model
    ){
        model.addAttribute("name", username);
        model.addAttribute("age", age);

        return "Example-birthday";
    }
}

