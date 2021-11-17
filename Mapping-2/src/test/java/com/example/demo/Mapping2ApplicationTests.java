package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;

import com.example.demo.layer2.Property;
import com.example.demo.layer3.CustomerImpl;


@SpringBootTest
class Mapping2ApplicationTests {

	
	@Autowired
	CustomerImpl cusRepo;
	
	@Test
	void insertCustTest()
	{
		//LocalDate ID=LocalDate.of(1997, 04, 14);
		Customer Cus=new  Customer();
		Cus.setFirstName("krushana");
		Cus.setMiddleName("gajanan");
		Cus.setLastName("Thakare");
		Cus.setEmail("kru4797@gmail.com");
		Cus.setPassword("ram@827761");
		Cus.setPhoneNo(880512891);
		Cus.setDob(LocalDate.of(2022, 11, 25));
		Cus.setNationality("Indian");
		Cus.setAdhaarNo(123454232);
		Cus.setPanCard("Ramkr223t8");		
		
		cusRepo.insertCustomer(Cus);
		
	      
	
		
	}
	
	
	@Test
	void selectCustTest()
	{
		Customer cust;
		cust=cusRepo.selectCustomer(1);
		//System.out.println("repo "+cust.getCust_Id());
		System.out.println("repo "+cust.getFirstName());
		System.out.println("repo "+cust.getMiddleName());
		System.out.println("repo "+cust.getLastName());
		System.out.println("repo "+cust.getEmail());
		System.out.println("repo "+cust.getPassword());
		System.out.println("repo "+cust.getPhoneNo());
		System.out.println("repo "+cust.getDob());
		System.out.println("repo "+cust.getNationality());
		System.out.println("repo "+cust.getAdhaarNo());
		System.out.println("repo "+cust.getAdhaarNo());
		

		
	}
	
	@Test
	void selectAllCustTest()
	{
		List<Customer> custList;
		custList=cusRepo.selectCustomers();
		for(Customer cust :custList)
		{
			System.out.println("repo "+cust.getCust_Id());
			System.out.println("repo "+cust.getFirstName());
			System.out.println("repo "+cust.getMiddleName());
			System.out.println("repo "+cust.getLastName());
			System.out.println("repo "+cust.getEmail());
			System.out.println("repo "+cust.getPassword());
			System.out.println("repo "+cust.getPhoneNo());
			System.out.println("repo "+cust.getDob());
			System.out.println("repo "+cust.getNationality());
			System.out.println("repo "+cust.getAdhaarNo());
			System.out.println("repo "+cust.getAdhaarNo());
			
			System.out.println("-----------------------------------");
			
			
		}
	}
	
}
