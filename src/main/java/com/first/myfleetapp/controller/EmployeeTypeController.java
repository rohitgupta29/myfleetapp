package com.first.myfleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeTypeController {

    @GetMapping("/employeetype")
    public String getEmployeeType() {
        return "employeeType";
    }
}
