package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;

@Repository
public interface LoanRepo {
	void insertLoan(Loan Lobj);
	Loan selectLoan(int loanId); //R
	List<Loan> selectLoans(); //RA
	
	void updateLoan(Loan Lobj); //U
	void deleteLoan(int loanId);
}
