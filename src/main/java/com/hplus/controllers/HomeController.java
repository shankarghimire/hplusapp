package com.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        return "index";
    }

    @GetMapping("/goToSearch")
    public String gotToSearch(){
        return "search";
    }
}
