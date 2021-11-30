package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;

import com.example.demo.layer2.Property;
import com.example.demo.layer3.CustomerReposioryImpl;
import com.example.demo.layer3.PropertyRepositoryImpl;

@SpringBootTest
class HomeLoanApplicationTests {
	@Autowired
	CustomerReposioryImpl cusRepo;
	
	@Autowired
	PropertyRepositoryImpl proRepo;
	@Test
	void insertCusTest()
	{
		Customer Cus=new  Customer();
		
		Cus.setFirstName("Krushna");
		Cus.setMiddleName("Gajanan");
		Cus.setLastName("Thakare");
		Cus.setEmail("krushnathakare4797@gmail.com");
		Cus.setPassword("ram@1234");
		Cus.setPhoneNo(89990706);
		Cus.setDob(LocalDate.of(2021, 11, 25));
		Cus.setNationality("Indian");
		Cus.setAdhaarNo(1234542232);
		Cus.setPanCard("Ramkr223t8");
		cusRepo.insertCustomer(Cus);
		
}

	@Test
	void selectCusTest()
	{
		Customer cus;
		cus=cusRepo.selectCustomer(3);
		System.out.println("repo : cus "+cus);
		System.out.println("cus"+cus.getCust_Id());
		System.out.println("cus "+cus.getFirstName());
		System.out.println("cus "+cus.getMiddleName());
		System.out.println("cus "+cus.getLastName());
		System.out.println("cus "+cus.getAdhaarNo());
		System.out.println("cus "+cus.getEmail());
		System.out.println("cus "+cus.getNationality());
		System.out.println("cus "+cus.getPanCard());
	
		
		
}
	
	@Test
	void selectAllCustTest()
	{
		List<Customer> custList;
		custList=cusRepo.selectCustomers();
		for(Customer cus :custList)
		{
			System.out.println("cus"+cus.getCust_Id());
			System.out.println("cus "+cus.getFirstName());
			System.out.println("cus "+cus.getMiddleName());
			System.out.println("cus "+cus.getLastName());
			System.out.println("cus "+cus.getAdhaarNo());
			System.out.println("cus "+cus.getEmail());
			System.out.println("cus "+cus.getNationality());
			System.out.println("cus "+cus.getPanCard());
		
			
		}
		
		
		

		
	}
	@Test
	void updateCustTest()
	{


	Customer cust = null;
	cust =cusRepo.find(Customer.class, 25);
	Assertions.assertNotNull(cust);

	cust.setFirstName("ritesh");
	cust.setMiddleName("Pravin");
	cust.setLastName("Patil");
	cust.setEmail("ritesh@gmail.com");
	cust.setPassword("lokesh@1234");
	cust.setPhoneNo(84599503);
	cust.setDob(LocalDate.of(1998, 10, 07));
	cust.setNationality("Indian");
	cust.setAdhaarNo(12233);
	cust.setPanCard("PL22389KM");



	cusRepo.updateCustomer(cust);
	}
	@Test
	void deleteDeptTest()
	{
		Customer Cus=new Customer();
		Cus.getCust_Id();
		cusRepo.selectCustomer(2);
	}
	
	

}
