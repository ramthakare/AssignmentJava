package com.example.demo.layer3;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;
@Repository
public class BankRepositoryImpl extends BaseRepository implements BankRepository {

	@Transactional
	public void insertBank(Bank Bobj) {
		// TODO Auto-generated method stub
		super.persist(Bobj);
		System.out.println("Bank inserted...");

	}

	@Transactional
	public Bank selectBank(int b_id) {
		System.out.println("BankRepositoryImpl : selecting bank  by b_id");
		Bank bank = super.find(Bank.class, b_id);
		System.out.println("repo : bank "+bank);
		System.out.println("bank"+bank.getB_Id());
		System.out.println("bank"+bank.getBankName());
		System.out.println("bank"+bank.getAccountNo());
		System.out.println("bank"+bank.getIfscCode());
		
		
	


		
		
		return bank;
	}

	@Transactional
	public List<Bank> selectBanks() {
		List<Bank>  bankList = new ArrayList<Bank>();

		System.out.println("BankRepositoryImpl : Selecting all Bank...");
		bankList =  super.findAll("Bank");
		System.out.println("repo : bankList ref  "+bankList);
		System.out.println("repo : bankList size "+bankList.size());

		for(Bank bank : bankList) {
			//System.out.println("repo: dept "+dept.getDepartmentNumber());
			System.out.println("repo : bank "+bank);
			System.out.println("bank"+bank.getB_Id());
			System.out.println("bank"+bank.getBankName());
			System.out.println("bank"+bank.getAccountNo());
			System.out.println("bank"+bank.getIfscCode());

		}
		return bankList;
	}

	@Transactional
	public void updateBank(Bank Bobj) {
		System.out.println("BankRepositoryImpl : Updating Bank...");
		super.merge(Bobj);
		
	}

	@Transactional
	public void deleteBank(int b_id) {
		System.out.println("BankRepositoryImpl : Deleting property");
		super.remove(Bank.class, b_id);
		
	}

	
	
}
