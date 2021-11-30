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
	
	
	

}

