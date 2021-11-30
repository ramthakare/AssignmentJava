package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;

@Repository
public class LoanRepositoryImpl extends BaseRepository implements LoanRepo{

	@Transactional
	public void insertLoan(Loan Lobj) {
		super.persist(Lobj); // invoking the dummy persist of the super class
		System.out.println("Loan inserted...");
		
	}

	@Override
	public Loan selectLoan(int loanId) {
		System.out.println("LoanRepositoryImpl : selecting customer  by propertyId");
	      Loan loan = super.find(Loan.class, loanId);
		System.out.println("repo : loan "+loan);
		
		System.out.println("loan   :" +loan.getLoanId());
		System.out.println("loan   :" +loan.getMaxLoanGrant());
		System.out.println("loan   :" +loan.getTenure());
		System.out.println("loan   :" +loan.getRoi());
		System.out.println("loan   :" +loan.getEmi());
		System.out.println("loan   :" +loan.getLoanAmount());
		
		
		
	


		
		
		return loan;
	}

	@Override
	public List<Loan> selectLoans() {
		List<Loan>  loanList = new ArrayList<Loan>();

		System.out.println("LoanRepositoryImpl : Selecting all Loan...");
		loanList =  super.findAll("Loan");
		System.out.println("repo : loanList ref  "+loanList);
		System.out.println("repo : loanList size "+loanList.size());

		for(Loan loan : loanList) {
			System.out.println("loan   :" +loan.getLoanId());
			System.out.println("loan   :" +loan.getMaxLoanGrant());
			System.out.println("loan   :" +loan.getTenure());
			System.out.println("loan   :" +loan.getRoi());
			System.out.println("loan   :" +loan.getEmi());
			System.out.println("loan   :" +loan.getLoanAmount());
			
			

		}
		return loanList;
	}

	@Transactional
	public void updateLoan(Loan Lobj) {
		System.out.println("PropertyRepositoryImpl : Updating Property...");
		super.merge(Lobj);
		
	}

	@Transactional
	public void deleteLoan(int loanId) {
		System.out.println("LoanRepositoryImpl : Deleting loan");
		super.remove(Loan.class, loanId);
		
	}

	

}
