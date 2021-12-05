package com.example.demo.layer5Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Loan;
import com.example.demo.layer3.LoanRepositoryImpl;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanRepositoryImpl loanRepo;
	
	@RequestMapping("/getloan/{loanId}")//localhost:8080/cust/getCust
	public Loan getLoan(@PathVariable("loanId") int x)
	{
		Loan loan = null;
		loan=loanRepo.selectLoan(x);
		
		System.out.println("controller : loan : "+loan.getLoanId());
		return loan;
	}
	@RequestMapping("/getAll")//localhost:8080/cust/getAll
	public List<Loan> getloans()
	{
		System.out.println("getAll");
		List<Loan> loanList;
		loanList=loanRepo.selectLoans();
		return loanList;
	}
}
