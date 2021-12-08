package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Application_Details;
import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;
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
		bank.setB_Id(57);
		bank.setAccountNo(6234567);
		bank.setBankName("HDFC BANK");
		bank.setIfscCode("HDFC2234");
	
		bankRepo.insertBank(bank);
	}
	
	@Test
	void selectBankTest()
	{
		Bank bank;
		bank=bankRepo.selectBank(55);
		System.out.println("repo : bank "+bank);
		System.out.println("bank"+bank.getB_Id());
		System.out.println("bank"+bank.getBankName());
		System.out.println("bank"+bank.getAccountNo());
		System.out.println("bank"+bank.getIfscCode());
	
		
		
}
	@Test
	void selectAllBankTest()
	{
		List<Bank> bankList;
		bankList=bankRepo.selectBanks();
		for(Bank bank :bankList)
		{
			System.out.println("bank"+bank.getB_Id());
			System.out.println("bank"+bank.getBankName());
			System.out.println("bank"+bank.getAccountNo());
			System.out.println("bank"+bank.getIfscCode());
		
		
			
		}
		
		
		

		
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
	
	@Test
	void deleteBankTest()
	{
		Bank bank=new Bank();
		bank.getB_Id();
	 
		
		bankRepo.deleteBank(55);
	}
	
}
