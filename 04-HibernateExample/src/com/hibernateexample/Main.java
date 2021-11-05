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
	
	Session session = factory.getCurrentSession();
	
	try {
	    session.beginTransaction();
	    
	    // from city (Select * from city)
	    // from City c where c.countryCode='TUR' AND district='Ankara'
	    // from City c where c.name LIKE '%kar%'
	    
	    List<City> cities = session.createQuery("from City c where c.name LIKE '%kar%'").getResultList();
	    
	    for(City city:cities) {
		System.out.println(city.getName());
	    }
	    
	    session.getTransaction().commit();
	}
	finally {
	    factory.close();
	}
    }

}
