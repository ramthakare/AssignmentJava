package com.example.demo.layer2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Application11")
public class Application_Details {
  
	@Id
	@GeneratedValue
	private int application_No;
	
	private String comments;
	
	private String status;
	 
	private long expected_Amount;
	
	private int Tenure;
	
	@OneToOne
	private Customer customer;

	public int getApplication_No() {
		return application_No;
	}

	public void setApplication_No(int application_No) {
		this.application_No = application_No;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getExpected_Amount() {
		return expected_Amount;
	}

	public void setExpected_Amount(long expected_Amount) {
		this.expected_Amount = expected_Amount;
	}

	public int getTenure() {
		return Tenure;
	}

	public void setTenure(int tenure) {
		Tenure = tenure;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
