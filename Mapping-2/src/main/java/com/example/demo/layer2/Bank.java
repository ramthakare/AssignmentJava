package com.example.demo.layer2;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="bank1")
public class Bank {
	
	@Id
	@GeneratedValue
	private int b_Id;
	
	public int getB_Id() {
		return b_Id;
	}
	public void setB_Id(int b_Id) {
		this.b_Id = b_Id;
	}
	//@Column(name="BankName")
	private String bankName;
	

	
	//@Column(name="Account_No")
	 private long accountNo;
	
	//@GeneratedValue
	private String ifscCode;
	
	//@JoinColumn(name="appId")
	// private int appId;
	 
	 @OneToOne
	 private Customer customer;
	 
	 
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	/*public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}*/
}
