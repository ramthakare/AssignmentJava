package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.CustomerReposioryImpl;
import com.example.demo.layer3.LoanRepositoryImpl;
import com.example.demo.layer3.PropertyRepositoryImpl;

@SpringBootTest
public class OneToOneTests {
	@Autowired
	CustomerReposioryImpl cusRepo;
	
	@Autowired
	PropertyRepositoryImpl proRepo;
	
	@Autowired
	LoanRepositoryImpl loanRepo;
	
	////CustmerAndPrperty
	@Test
	void assignExistingPropertyToExistingCustomer()
	{
		Customer customer=cusRepo.find(Customer.class,5);
		Property property=proRepo.find(Property.class, 10);
				
		//customer.setProperty(property);
		//proRepo.sel
		
		customer.setProperty(property);
		property.setCustomer(customer);
		//property.setCustomer(customer);
		
		cusRepo.merge(property);
		proRepo.merge(customer);
		
		
	}
	
	//CustmerAndLoan
	
	@Test
	void assignExistingLoanToExistingCustomer()
	{
		Customer customer=cusRepo.find(Customer.class,4);
		Loan loan=loanRepo.find(Loan.class, 3);
				
		//customer.setProperty(property);
		//proRepo.sel
		
		customer.setLoan(loan);
	loan.setCustomer(customer);
		//property.setCustomer(customer);
		
		cusRepo.merge(loan);
		proRepo.merge(customer);
		
		
	}
}
