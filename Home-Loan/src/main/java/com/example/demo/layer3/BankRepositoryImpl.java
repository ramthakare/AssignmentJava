package com.example.demo.layer3;


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
	   System.out.println("BankRepositoryImpl");
		return null;
	}

	@Transactional
	public List<Bank> selectBanks() {
		// TODO Auto-generated method stub
		return null;
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
