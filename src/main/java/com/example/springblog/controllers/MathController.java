package com.example.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {

    @GetMapping("/add/3/add/4")
    @ResponseBody
    public int mathResponse(){
        int num1 = 3;
        int num2 = 4;
        return num1 + num2;
    }


}
