package com.example.demo.layer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="customer10")
public class Customer 
{
	@Id
	@GeneratedValue
	private int Cust_Id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private long phoneNo;
	
	private LocalDate dob;
	
	private String nationality;
	
	

	private long adhaarNo;
	
	
	private String panCard;
	 
	
		@OneToOne
	private Property property;
	
		@OneToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customer")
		private Bank bank;
		
		@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customer")
	private	Application_Details application_details;
		
		@OneToOne
		private Loan loan;
		
		@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customer")
		private Tracker tracker;
		
		@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	    private Set<Document> doc=new HashSet<Document>(); 
		
       

	public Set<Document> getDoc() {
			return doc;
		}
		public void setDoc(Set<Document> doc) {
			this.doc = doc;
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
		}
	public Application_Details getApplication_details() {
			return application_details;
		}
		public void setApplication_details(Application_Details application_details) {
			this.application_details = application_details;
		}
	public Bank getBank() {
			return bank;
		}
		public void setBank(Bank bank) {
			this.bank = bank;
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
