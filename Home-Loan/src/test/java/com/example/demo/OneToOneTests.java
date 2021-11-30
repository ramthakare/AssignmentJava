package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.CustomerReposioryImpl;
import com.example.demo.layer3.PropertyRepositoryImpl;

@SpringBootTest
public class OneToOneTests {
	@Autowired
	CustomerReposioryImpl cusRepo;
	
	@Autowired
	PropertyRepositoryImpl proRepo;
	@Test
	void assignExistingPropertyToExistingCustomer()
	{
		Customer customer=cusRepo.find(Customer.class,1);
		Property property=proRepo.find(Property.class, 6);
				
		//customer.setProperty(property);
		//proRepo.sel
		
		customer.setProperty(property);
		property.setCustomer(customer);
		//property.setCustomer(customer);
		
		cusRepo.merge(property);
		proRepo.merge(customer);
		
		
	}
}
