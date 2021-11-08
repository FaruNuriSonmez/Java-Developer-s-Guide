package com.jpa.example.dataAccess;

import java.util.List;

import com.jpa.example.entites.City;

public interface ICityDal {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
