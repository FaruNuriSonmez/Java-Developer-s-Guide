package com.hibernateexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="countryCode")
    private String countryCode;
    @Column(name="population")
    private String population;
    
    public int getId() {
	return id;
    }
    
    public void setId(int id) {
	this.id = id;
    }
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
    public String getCountryCode() {
	return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }
    
    public String getPopulation() {
	return population;
    }
    
    public void setPopulation(String population) {
	this.population = population;
    }
}
