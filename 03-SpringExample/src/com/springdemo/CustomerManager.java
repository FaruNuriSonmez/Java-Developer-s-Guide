package com.springdemo;

public class CustomerManager implements ICustomerService {
	
    	
    	
	private ICustomerDal customerDal;
	
	//Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
}
