package com.example.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/user/create")
    public String createUserForm(){
        return "user/create";
    }

    @PostMapping("/user/create")
    @ResponseBody
    public String createUser(
            @RequestParam(name = "names") String username,
            @RequestParam(name = "psw") String password
    ){
        System.out.println("Username " + username);
        System.out.println("Password " + password);
            return "User Created";
    }

}
