package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="document8")
public class Document {
	@Id
	@GeneratedValue
	//@Column(name="DocId")
	private int docId;
	
	//@Column(name="Pan_Card")
	private String panCard;
	
	//@Column(name="Voter_Id")
	private String voterId;
	
	
	//@Column(name="Salary_Slip")
	private String salarySlip;
	
	//@Column(name="Loc")
	private long loa;
	
	//@Column(name="Noc_From_Builder")
	private String nocFromBuilder;
	
	
	//@Column(name="Agreement_To_sale")
	private String agreementToSale;
	
	//@JoinColumn(name="appId")
	//private int appId;
	
  @ManyToOne
  private Customer customer;
	public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public long getLoa() {
		return loa;
	}
	public void setLoa(long loa) {
		this.loa = loa;
	}
	public String getNocFromBuilder() {
		return nocFromBuilder;
	}
	public void setNocFromBuilder(String nocFromBuilder) {
		this.nocFromBuilder = nocFromBuilder;
	}
	public String getAgreementToSale() {
		return agreementToSale;
	}
	public void setAgreementToSale(String agreementToSale) {
		this.agreementToSale = agreementToSale;
	}

}
