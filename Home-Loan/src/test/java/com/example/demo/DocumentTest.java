package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Document;
import com.example.demo.layer3.CustomerReposioryImpl;
import com.example.demo.layer3.DocumentRepositoryImpl;

@SpringBootTest
public class DocumentTest 
{
 @Autowired
 DocumentRepositoryImpl DocRepo;
 
 @Autowired
 CustomerReposioryImpl custRepo;
	
 @Test
	void insertDocument()
	{
	 Customer customer =custRepo.selectCustomer(33);
		Document doc=new Document();
		{
			doc.setPanCard("Ram1234cu");
			doc.setVoterId("hjkkfj68574");
			doc.setLoa(1627384);
			doc.setNocFromBuilder("hjwdjhjkhjkhjkh");
			doc.setSalarySlip("yes");
			doc.setAgreementToSale("Yes");
			doc.setCustomer(customer);
			
			DocRepo.insertDocument(doc);
			
		}
	}
}
