package Com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="loan")
public class Loan {
	
	@Id
	@Column(name="LoanId")
	private int loanId;
	
	@Column(name="max_Loan_Grant")
	 private float maxLoanGrant;
	
	@Column(name="Year")
	 private int tenure;
	
	@Column(name="Loan_Amount")
	 private float loanAmount;
	
	@Column(name="Rate_of_Intrest")
	 private double roi;
	
	@Column(name="EMI")
	 private float emi;
	
	@JoinColumn(name="appId")
	 private int appId;
	 
	 @OneToOne
	 private Customer customer;
	 
	 @OneToOne
	 private Tracker tracker;
	 
	 
	public Tracker getTracker() {
		return tracker;
	}
	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public float getMaxLoanGrant() {
		return maxLoanGrant;
	}
	public void setMaxLoanGrant(float maxLoanGrant) {
		this.maxLoanGrant = maxLoanGrant;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public float getEmi() {
		return emi;
	}
	public void setEmi(float emi) {
		this.emi = emi;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
}
