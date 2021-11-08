package com.jpa.example.business;

import java.util.List;

import com.jpa.example.entites.City;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
