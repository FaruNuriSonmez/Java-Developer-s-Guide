package com.hibernateexample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {
	SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(City.class)
		.buildSessionFactory();
	
	// Unit of Work
	Session session = factory.getCurrentSession();
	
	try {
	    session.beginTransaction();
	    // HQL
	    // from city (Select * from city)
	    // from City c where c.countryCode='TUR' AND district='Ankara'
	    // from City c where c.name LIKE '%kar%'
	    // from City c ORDER BY name
	    
	    //getQuery(session);
	    add(session);
	    
	}
	finally {
	    factory.close();
	}
    }
    
    public static void getQuery(Session session) {
	
	List<City> cities = session.createQuery("from City c ORDER BY name").getResultList();
	    
	    for(City city:cities) {
		System.out.println(city.getName());
	    }
	    	    
	    session.getTransaction().commit();
    }
    
    public static void add(Session session) {
	City city = new City();
	city.setName("Kayseri 10");
	city.setCountryCode("TUR");
	city.setDistrict("İç Anadolur");
	city.setPopulation(1000);
	
	session.save(city);
	
	session.getTransaction().commit();
	
	System.out.println("City Added.");
    }

}
