package com.jpa.example.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.example.business.ICityService;
import com.jpa.example.entites.City;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;
    
    @Autowired
    public CityController(ICityService cityService) {
	this.cityService = cityService;
    }
    
    @GetMapping("/cities")
    public List<City> get(){
	return cityService.getAll();
    }
}
