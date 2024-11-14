package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class VehicleMakeController {

    @GetMapping("/vehiclemake")
    public String getVehicleMake() {
        return "vehicleMake";
    }
}
