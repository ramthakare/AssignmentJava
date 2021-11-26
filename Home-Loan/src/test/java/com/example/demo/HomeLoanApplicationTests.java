package com.example.demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.CustomerReposioryImpl;

@SpringBootTest
class HomeLoanApplicationTests {
	@Autowired
	CustomerReposioryImpl cusRepo;
	@Test
	void insertCusTest()
	{
		Customer Cus=new  Customer();
		Cus.setFirstName("abc");
		Cus.setFirstName("ram_neova");
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
	void selectCusTest()
	{
		Customer cus;
		cus=cusRepo.selectCustomer(11);
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
	

}
