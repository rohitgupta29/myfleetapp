package com.first.myfleetapp.controller;

import com.first.myfleetapp.models.Country;
import com.first.myfleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model) {

        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }
}
