package com.example.demo.layer2;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMP10")
public class Employee {
  
	@Id
	@Column(name="EMPNO")
	private int empno;
	
	@Column(name="ENAME")
	private String ename;
	
	@Column(name="JOB")
	private String  job;
	
	@Column(name="MGR")
	private Integer mgr;
	
	@Column(name="HIREDATE")
	private LocalDate date;
	
	@Column(name="SAL")
	private Float salary;
	
	@Column(name="COMM")
	private Float comm;
	@Column(name="DEOTNO")
	private int dno;
	
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	
	
	//@OneToMany // only relationship - no 4th column 
	//Set<Employee> empSet = new HashSet<Employee>();
	
	

	/*public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}*/

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Float getComm() {
		return comm;
	}

	public void setComm(Float comm) {
		this.comm = comm;
	}

	

	
	
	
	
	
}
