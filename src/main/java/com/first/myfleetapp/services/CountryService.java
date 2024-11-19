package com.first.myfleetapp.services;

import com.first.myfleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.myfleetapp.models.Country;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Return list of countries
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }
    // Save new Country
    public void save(Country country) {
        countryRepository.save(country);
    }

}
