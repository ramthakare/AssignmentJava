package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bank;

@Repository
public interface BankRepo 
{
	 void insertBank(Bank Bobj);
	 Bank selectBank(int b_id); //R
		List<Bank> selectBanks(); //RA
		
		void updateBank(Bank Bobj); //U
		void deleteBank(int b_id); //D
}
