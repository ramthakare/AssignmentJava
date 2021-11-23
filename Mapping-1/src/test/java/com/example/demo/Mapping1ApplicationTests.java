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

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;

import com.example.demo.layer2.Property;
import com.example.demo.layer3.BankImpl;
import com.example.demo.layer3.CustomerReposioryImpl;
import com.example.demo.layer3.PropertyRepository;
import com.example.demo.layer3.PropertyRepositoryImpl;



@SpringBootTest
class Mapping1ApplicationTests {

	
@Autowired
CustomerReposioryImpl cusRepo;
 
@Autowired
PropertyRepositoryImpl proRepo;

@Autowired
BankImpl bankRepo;
	 
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
		cus=cusRepo.selectCustomer(30);
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
	void deleteDeptTest()
	{
		Customer cus=new Customer();
		cus.getCust_Id();
		cusRepo.deleteCustomer(30);
	}
	
	@Test
	void insertProTest()
	{
		Property pro=new Property();
		pro.setPropertyLoc("Pune");
		pro.setPropertyName("2 Bhkflat");
		pro.setEstimatedAmt(1434.0f);
		pro.setTypeOfEmp("permant");
		pro.setRetAge(65);
		pro.setOrgType("Software Developer");
		pro.setEmployerName("Ram");
		pro.setIncome("35000");
		proRepo.insertProperty(pro);
	}
	
	@Test
	void insertAdminTest()
	{
	Admin admin= new Admin();
	
	
	admin.setUsername("Ramth1");
	admin.setPassword("1234@");
	}
	
	@Test
	void insertbanTest()
	{
	    Bank bank=new Bank();
	    bank.setB_Id(5);
	    bank.setAccountNo(1234567);
	    bank.setBankName("Bank Of Maharastra");
	    bank.setIfscCode("MHA123");
	    bankRepo.insertBank(bank);
	}
	

}
