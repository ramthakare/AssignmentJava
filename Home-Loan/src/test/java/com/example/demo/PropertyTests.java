package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.PropertyRepositoryImpl;

@SpringBootTest
public class PropertyTests {
	@Autowired
	PropertyRepositoryImpl proRepo;
	
	@Test
	void insertProTest()
	{
		Property pro=new Property();
		pro.setPropertyLoc("Navi Mumbai");
		pro.setPropertyName("1 Bhkflat");
		pro.setEstimatedAmt(1434.0f);
		pro.setTypeOfEmp("permant");
		pro.setRetAge(65);
		pro.setOrgType("Software Developer");
		pro.setEmployerName("Ram");
		pro.setIncome("35000");
		proRepo.insertProperty(pro);
	}
	
	@Test
	void selectProTest()
	{
		Property pro;
		pro=proRepo.selectProperty(10);
		System.out.println("repo : pos "+pro);
		System.out.println("pro  :" +pro.getPropertyId());
		System.out.println("pos  :" +pro.getPropertyLoc());
		System.out.println("pos  :" +pro.getPropertyName());
		System.out.println("pos  :" +pro.getEstimatedAmt());
		System.out.println("pos  :" +pro.getTypeOfEmp());
		System.out.println("pos  :" +pro.getRetAge());
		System.out.println("pos  :" +pro.getOrgType());
		System.out.println("pos  :" +pro.getEmployerName());
		System.out.println("pos  :" +pro.getIncome());
		
		
		
}
	@Test
	void selectAllProTest()
	{
		List<Property> proList;
		proList=proRepo.selectPropertys();
		for(Property pro :proList)
		{
			System.out.println("pro  :" +pro.getPropertyId());
			System.out.println("pos  :" +pro.getPropertyLoc());
			System.out.println("pos  :" +pro.getPropertyName());
			System.out.println("pos  :" +pro.getEstimatedAmt());
			System.out.println("pos  :" +pro.getTypeOfEmp());
			System.out.println("pos  :" +pro.getRetAge());
			System.out.println("pos  :" +pro.getOrgType());
			System.out.println("pos  :" +pro.getEmployerName());
			System.out.println("pos  :" +pro.getIncome());
			
			
			
			System.out.println("---------------------------------------------------------------");
			
		
			
		}
		
		
		

		
	}
	@Test
	void updateProtTest()
	{


	Property pro = null;
	pro =proRepo.find(Property.class, 10);
	Assertions.assertNotNull(pro);

	pro.setPropertyLoc("Navi Mumbai");
	pro.setPropertyName("1 Bhkflat");
	pro.setEstimatedAmt(1434.0f);
	pro.setTypeOfEmp("permant");
	pro.setRetAge(65);
	pro.setOrgType("Software Developer");
	pro.setEmployerName("Ram Thakare");
	pro.setIncome("35000");
	



	proRepo.updateProperty(pro);
	}
	
	@Test
	void deleteProTest()
	{
		Property pro=new Property();
		
		pro.getPropertyId();
		proRepo.selectProperty(12);
	}
	
	

}

