package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class VehicleController {
    @GetMapping("/vehicle")
    public String getVehicle() {
        return "vehicle";
    }
}
