package com.shohab.SpringBoot55.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class StudentController {
    @GetMapping("/")
    public String allStudent(){
        return "student";
    }

    @GetMapping("/shohab")
    public String allTeacher(){
        return "shohab";
    }
}
