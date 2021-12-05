package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Application_Details;
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
}
