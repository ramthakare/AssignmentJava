package com.example.demo.layer2;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;


@Entity
@Table(name="customer1")
public class Customer 
{
	@Id
	@GeneratedValue
	private int Cust_Id;
	
	//@Column(name="first_name")
	private String firstName;
	
	//@Column(name="Middle_Name")
	private String middleName;
	
	//@Column(name="Last_Name")
	private String lastName;
	
	//@Column(name="Email")
	private String email;
	
	//@Column(name="Password")
	private String password;
	
	//@Column(name="Phone_No")
	private long phoneNo;
	
	//@Column(name="Birth_Date")
	private LocalDate dob;
	
	//@Column(name="Nationality")
	private String nationality;
	
	//@Column(name="Adhaar_No")

	private long adhaarNo;
	
	
	//@Column(name="Pan_Card")
	private String panCard;
	 
	
	//@Column(name="propertyid")
	//private String propertyId;
	//@JoinColumn(name="LoanId")
	//private int loanId;
	
	//@JoinColumn(name="DocId")
	//private int docId;
	
	@OneToOne
	private Property property;
	
	@OneToOne
	private Application_Details application_details;
	
	
	
	@OneToOne
     private Bank bank;
	
	 
	   public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	@ManyToOne
		
		private Document document;
	
	// @OneToOne
	//    private Loan loan;
		
	// @OneToOne
	 //private Tracker tracker;*/
	 
	
	/*public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Tracker getTracker() {
		return tracker;
	}
	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}*/
	
	/*public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}*/
	
	
	
	
	public Application_Details getApplication_details() {
		return application_details;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public void setApplication_details(Application_Details application_details) {
		this.application_details = application_details;
	}
	public int getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	
	
	
}
