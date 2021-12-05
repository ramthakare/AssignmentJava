package com.example.demo.layer5Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Bank;

import com.example.demo.layer3.BankRepositoryImpl;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	BankRepositoryImpl bankRepo;
	
	@RequestMapping("/getbank/{b_id}")//localhost:8080/cust/getCust
	public Bank getBank(@PathVariable("b_id") int x)
	{
		Bank bank = null;
		bank=bankRepo.selectBank(x);
		
		System.out.println("controller : loan : "+bank.getB_Id());
		return bank;
	}
	@RequestMapping("/getAll")//localhost:8080/cust/getAll
	public List<Bank> getbanks()
	{
		System.out.println("getAll");
		List<Bank> bankList;
		bankList=bankRepo.selectBanks();
		return bankList;
	}
}
