package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Tracker8")
public class Tracker {
	@Id
	private int Tracker_Id;

	//@Column(name="Status")
	 private String status;

	//@Column(name="Approved_Date")
	 private LocalDate approvedDate;
      
	@OneToOne
	private Loan loan;
	
	@OneToOne
	private Customer customer;
	
	

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
	
	public int getTracker_Id() {
		return Tracker_Id;
	}
	public void setTracker_Id(int tracker_Id) {
		Tracker_Id = tracker_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}
}
