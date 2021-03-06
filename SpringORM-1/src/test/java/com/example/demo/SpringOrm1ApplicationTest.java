package com.example.demo;


	import java.time.LocalDate;
import java.util.List;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImp;

	
	@SpringBootTest
	public class SpringOrm1ApplicationTest {
		
		
		@Autowired
		EmployeeRepositoryImp empRepo;
		
		 
		@Test
		void insertEmpTest()
		{
			LocalDate ID=LocalDate.of(1997, 04, 14);
			Employee emp=new  Employee();
			emp.setEmpno(5);
			emp.setEname("RUSHABH");
			emp.setJob("MECHANICAL");
			emp.setDate(ID);
			emp.setSalary(450.0f);
			emp.setJob("SCIENCE");
			emp.setComm(127.0f);
			emp.setMgr(7698);
			emp.setDno(30);
			
			
			empRepo.insertEmployee(emp);
			
		      
		
			
		}
		
		@Test
		void selectEmpTest()
		{
			Employee emp;
			emp=empRepo.selectEmployee(2);
			System.out.println(emp.getEmpno());
			System.out.println(emp.getEname());
			System.out.println(emp.getComm());
			
			

			
		}
		
		@Test
		void selectAllEmpTest()
		{
			List<Employee> empList;
			empList=empRepo.selectEmployees();
			for(Employee emp :empList)
			{
				System.out.println("Empno  :"+emp.getEmpno());
				System.out.println("Ename  :"+emp.getEname());
				System.out.println("EComm  :"+emp.getComm());
				System.out.println("EJob   :"+emp.getJob());
				System.out.println("EDate  :"+emp.getDate());
				System.out.println("Emgr   :"+emp.getMgr());
				System.out.println("esalary:"+emp.getSalary());
				System.out.println("dno    :"+emp.getDno());
				System.out.println("-----------------------------------");
				
				
			}
			
			
			

			
		}
		@Test
		void updateEmpTest()
		{
			LocalDate ID=LocalDate.of(1999, 12, 30);
			Employee emp=new Employee();
			
			emp.setEmpno(12);
			emp.setEname("NANU");
			emp.setMgr(2);
			emp.setJob("Tester");
			emp.setDate(ID);
			emp.setSalary(220.0f);
			emp.setComm(300.0f);
			emp.setDno(30);
			
			empRepo.updateEmployee(emp);
		}
		@Test
		void deleteDeptTest()
		{
			Employee emp=new Employee();
			emp.getEmpno();
			empRepo.selectEmployee(2);
		}
		
		
}
