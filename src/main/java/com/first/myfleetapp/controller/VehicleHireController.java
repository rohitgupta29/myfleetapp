package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class VehicleHireController {

    @GetMapping("/vehiclehire")
    public String getVehicleHire() {
        return "vehicleHire";
    }
}
