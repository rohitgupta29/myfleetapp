package com.first.myfleetapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {

    @GetMapping("/vehiclemovement")
    public String getVehicleMovement() {
        return "vehicleMovement";
    }
}
