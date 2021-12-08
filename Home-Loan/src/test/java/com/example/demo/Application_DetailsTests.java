package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Application_Details;
import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Loan;
import com.example.demo.layer3.Application_DetailsRepoImp;


@SpringBootTest
public class Application_DetailsTests {

	@Autowired
	Application_DetailsRepoImp applicationRepo;
	
	@Test
	void insertApplicationTest()
	{
		Application_Details application=new Application_Details();
		
		
		application.setComments("Done Document");
		application.setStatus("pending");
		application.setExpected_Amount(50000);
		application.setTenure(5);
		applicationRepo.insertApplication_Details(application);
	}
	
	@Test
	void selectApplicationTest()
	{
		Application_Details application;
		application=applicationRepo.selectApplication_Details(50);
		System.out.println("application_Details  :"+application.getApplication_No());
		System.out.println("application_Details  :"+application.getComments());
		System.out.println("application_Details  :"+application.getExpected_Amount());
		System.out.println("application_Details  :"+application.getStatus());
		System.out.println("application_Details  :"+application.getTenure());
	}
	
	
	@Test
	void selectAllApplicationTest()
	{
		List<Application_Details> applicationList;
		applicationList=applicationRepo.selectApplication_Details();
		for(Application_Details application :applicationList)
		{
			System.out.println("application_Details  :"+application.getApplication_No());
			System.out.println("application_Details  :"+application.getComments());
			System.out.println("application_Details  :"+application.getExpected_Amount());
			System.out.println("application_Details  :"+application.getStatus());
			System.out.println("application_Details  :"+application.getTenure());
			
		}
	}
		
		
		@Test
		void updateApplicationTest()
		{
          Application_Details application = null;
         application =applicationRepo.find(Application_Details.class, 50);
	   	Assertions.assertNotNull(application);
	   	
		application.setComments("Done Document");
		application.setStatus("SuccesFul");
		application.setExpected_Amount(60000);
		application.setTenure(5);
		



		applicationRepo.updateApplication_Details(application);
		}	
		
		@Test
		void deleteApplicationTest()
		{
			Application_Details application=new Application_Details();
			
		  application.getApplication_No();
			
		  applicationRepo.selectApplication_Details(34);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

