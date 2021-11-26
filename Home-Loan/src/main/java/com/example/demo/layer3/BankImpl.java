package com.example.demo.layer3;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bank;
@Repository
public class BankImpl extends BaseRepository implements BankRepo {

	@Transactional
	public void insertBank(Bank Bobj) {
		// TODO Auto-generated method stub
		super.persist(Bobj);
		System.out.println("Bank inserted...");

	}

	@Transactional
	public Bank selectBank(int b_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Bank> selectBanks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateBank(Bank Bobj) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteBank(int b_id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
