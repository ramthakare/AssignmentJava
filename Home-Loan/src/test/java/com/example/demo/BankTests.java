package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Loan;
import com.example.demo.layer3.BankRepositoryImpl;

@SpringBootTest
public class BankTests {


	@Autowired
	BankRepositoryImpl bankRepo;
	
	@Test
	void insertBankTest()
	{
		Bank bank=new Bank();
		bank.setB_Id(55);
		bank.setAccountNo(6234567);
		bank.setBankName("Central Bank Of Indian");
		bank.setIfscCode("CBI12234");
	
		bankRepo.insertBank(bank);
	}
	
	
	@Test
	void updateLoanTest()
	{


	Bank bank = null;
	bank =bankRepo.find(Bank.class, 55);
	Assertions.assertNotNull(bank);

	
	bank.setAccountNo(6234567);
	bank.setBankName("Central Bank Of Indian");
	bank.setIfscCode("CBI156782234");



	bankRepo.updateBank(bank);
	}
	
}
