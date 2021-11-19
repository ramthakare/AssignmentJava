package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.layer2.Property;

@Repository
public class PropertyRepositoryImpl extends BaseRepository implements PropertyRepository
{

	@Transactional
	public void insertProperty(Property pobj) {
		// TODO Auto-generated method stub
		super.persist(pobj); // invoking the dummy persist of the super class
		System.out.println("property inserted...");
	}

	@Transactional
	public List<Property> selectPropertys() 
	{
		List<Property>  proList = new ArrayList<Property>();

		System.out.println("PropertyRepositoryImpl : Selecting all property...");
		proList =  super.findAll("Property");
		System.out.println("repo : proList ref  "+proList);
		System.out.println("repo : proList size "+proList.size());

		for(Property pro : proList) {
			System.out.println("repo: pro "+pro.getPropertyId());
			System.out.println("repo: pro "+pro.getPropertyLoc());
			System.out.println("repo: pro "+pro.getPropertyName());
			System.out.println("repo: pro "+pro.getEstimatedAmt());
			System.out.println("repo: pro "+pro.getTypeOfEmp());
			System.out.println("repo: pro "+pro.getOrgType());
			System.out.println("repo: pro "+pro.getRetAge());
			System.out.println("repo: pro "+pro.getEmployerName());
			System.out.println("repo: pro "+pro.getIncome());
			
			

		}
		return proList;
	}
  
}
