package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEPT7")
public class Department{
	 

		@Id
		@Column(name="DEPTNO")
		private int departmentNumber;
		
		@Column(name="DNAME")
		private String departmentName;
		
		@Column(name="LOC")
		private String departmentLocation;
		
		
	/*	@Column(name="deptno") //to declare a FK 
		private int dept;// hasA*/
		
		
		
		
		
		
		public int getDepartmentNumber() {
			return departmentNumber;
		}
		public void setDepartmentNumber(int departmentNumber) {
			this.departmentNumber = departmentNumber;
		}
		public String getDepartmentName() {
			return departmentName;
		} 
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public String getDepartmentLocation() {
			return departmentLocation;
		}
		public void setDepartmentLocation(String departmentLocation) {
			this.departmentLocation = departmentLocation;
		}
		
}
