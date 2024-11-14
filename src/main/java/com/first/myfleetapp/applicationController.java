package com.first.myfleetapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class applicationController {

    @GetMapping("/index")
    public String goHome() {
        return "index";
    }
}
