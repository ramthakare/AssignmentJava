package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.LoanRepositoryImpl;


@SpringBootTest
public class LoanTests {

	
	@Autowired
	LoanRepositoryImpl loanRepo;
	
	@Test
	void insertLoanTest()
	{
		Loan loan=new Loan();
		loan.setLoanId(11);
		loan.setLoanAmount(345667.0f);
		loan.setMaxLoanGrant(67843.0f);
		loan.setRoi(2.5);
		loan.setEmi(789.0f);
		loan.setTenure(3);
		
		loanRepo.insertLoan(loan);
	}
	
	@Test
	void selectloanest()
	{
		Loan loan;
		loan=loanRepo.selectLoan(10);
		System.out.println("repo : loan "+loan);
		System.out.println("loan   :" +loan.getLoanId());
		System.out.println("loan   :" +loan.getMaxLoanGrant());
		System.out.println("loan   :" +loan.getTenure());
		System.out.println("loan   :" +loan.getRoi());
		System.out.println("loan   :" +loan.getEmi());
		System.out.println("loan   :" +loan.getLoanAmount());
		
		
	
		
		
}
	
	@Test
	void selectAllLoanTest()
	{
		List<Loan> loanList;
		loanList=loanRepo.selectLoans();
		for(Loan loan :loanList)
		{
			System.out.println("loan   :" +loan.getLoanId());
			System.out.println("loan   :" +loan.getMaxLoanGrant());
			System.out.println("loan   :" +loan.getTenure());
			System.out.println("loan   :" +loan.getRoi());
			System.out.println("loan   :" +loan.getEmi());
			System.out.println("loan   :" +loan.getLoanAmount());
			System.out.println("--------------------------------------------------------------");
			
		
			
		}
		
		
		

		
	}
	
	@Test
	void updateLoanTest()
	{


	Loan loan = null;
	loan =loanRepo.find(Loan.class, 10);
	Assertions.assertNotNull(loan);

	
	loan.setLoanAmount(345667.0f);
	loan.setMaxLoanGrant(67843.0f);
	loan.setRoi(2.5);
	loan.setEmi(789.0f);
	loan.setTenure(31);



	loanRepo.updateLoan(loan);
	}
	
	@Test
	void deleteLoanTest()
	{
		Loan loan=new Loan();
		
	
		loan.getLoanId();
		loanRepo.selectLoan(3);
	}
	
}
