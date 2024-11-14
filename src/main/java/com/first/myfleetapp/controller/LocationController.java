package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LocationController {

    @GetMapping("/location")
    public String getLocation() {
        return "location";
    }
}
