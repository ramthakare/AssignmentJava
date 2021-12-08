package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Application_Details;
import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.Application_DetailsRepoImp;
import com.example.demo.layer3.BankRepositoryImpl;
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
	
	
	@Autowired
	BankRepositoryImpl bankRepo;
	
	
	@Autowired
	Application_DetailsRepoImp applicationRepo;
	
	////CustmerAndPrperty
	@Test
	void assignExistingPropertyToExistingCustomer()
	{
		Customer customer=cusRepo.find(Customer.class,32);
		Property property=proRepo.find(Property.class, 27);
				
		//customer.setProperty(property);
		//proRepo.sel
		
		customer.setProperty(property);
		property.setCustomer(customer);
		//property.setCustomer(customer);
		
		cusRepo.merge(property);
		//proRepo.merge(customer);
		
		
	}
	
	//CustmerAndLoan
	
	@Test
	void assignExistingLoanToExistingCustomer()
	{
		Customer customer=cusRepo.find(Customer.class,39);
		Loan loan=loanRepo.find(Loan.class, 5);
				
		//customer.setProperty(property);
		//proRepo.sel
		
		customer.setLoan(loan);
	loan.setCustomer(customer);
		//property.setCustomer(customer);
		
		cusRepo.merge(loan);
		proRepo.merge(customer);
		
		
	}
	
	//CustmerAndBank
	     @Test
		void assignExistingBankToExistingCustomer()
		{
			Customer customer=cusRepo.find(Customer.class,4);
			Bank bank=bankRepo.find(Bank.class, 53);
					
			//customer.setProperty(property);
			//proRepo.sel
			
			customer.setBank(bank);
	       bank.setCustomer(customer);
			//property.setCustomer(customer);
			
			//cusRepo.merge(bank);
			bankRepo.merge(customer);
			
			
		}
	     
	     //CustomerAndApplication
	     @Test
	     void assignExistingApplicationtoExistiinCustomer()
	     {
	    	 Application_Details application=applicationRepo.find(Application_Details.class,15);
	    	 Customer customer=cusRepo.find(Customer.class,4);
	    	 
	    	 application.setCustomer(customer);
	    	 customer.setApplication_details(application);
	    	 //cusRepo.merge(application);
	    	 applicationRepo.merge(customer);
	    	 
	    	 
	    	 
	     }
	     
//	     
//	     //CustomerAndTracking
//	     
//	  
}
