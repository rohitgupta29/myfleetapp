package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class VehicleMaintenanceController {

    @GetMapping("/vehiclemaintenance")
    public String getVehicleMaintenance() {
        return "vehicleMaintenance";
    }
}
