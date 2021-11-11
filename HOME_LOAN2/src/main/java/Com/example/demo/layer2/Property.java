package Com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="property1")
public class Property {
	@Id
	@Column(name="propertyid")
	private String propertyId;
	
	@Column(name="propertyloc")
	private String propertyLoc;
	
	@Column(name="propertyName")
	private String propertyName;
	
	@Column(name="estimatedAmt")
	private float estimatedAmt;
	
	@Column(name="typeOfEmp")
	private String typeOfEmp;
	
	@Column(name="retAge")
	private int retAge;
	
	@Column(name="orgType")
	private  String orgType;
	
	@Column(name="employeeName")
	private  String employerName;
	
	@Column(name="income")
	private String income;
	
	@OneToOne
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyLoc() {
		return propertyLoc;
	}
	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public float getEstimatedAmt() {
		return estimatedAmt;
	}
	public void setEstimatedAmt(float estimatedAmt) {
		this.estimatedAmt = estimatedAmt;
	}
	public String getTypeOfEmp() {
		return typeOfEmp;
	}
	public void setTypeOfEmp(String typeOfEmp) {
		this.typeOfEmp = typeOfEmp;
	}
	public int getRetAge() {
		return retAge;
	}
	public void setRetAge(int retAge) {
		this.retAge = retAge;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	
}
