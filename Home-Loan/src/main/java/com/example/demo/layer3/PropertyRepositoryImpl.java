package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;

@Repository
public class PropertyRepositoryImpl extends BaseRepository implements PropertyRepository{

	@Transactional
	public void insertProperty(Property pobj) {
		// TODO Auto-generated method stub
		super.persist(pobj); // invoking the dummy persist of the super class
		System.out.println("property inserted...");
	}

	@Transactional
	public Property selectProperty(int propertyId) {
		System.out.println("PropertyRepositoryImpl : selecting customer  by propertyId");
		Property pos = super.find(Property.class, propertyId);
		System.out.println("repo : pos "+pos);
		
		System.out.println("pos" +pos.getPropertyId());
		System.out.println("pos" +pos.getPropertyLoc());
		System.out.println("pos" +pos.getPropertyName());
		System.out.println("pos" +pos.getEstimatedAmt());
		System.out.println("pos" +pos.getTypeOfEmp());
		System.out.println("pos" +pos.getRetAge());
		System.out.println("pos" +pos.getOrgType());
		System.out.println("pos" +pos.getEmployerName());
		System.out.println("pos" +pos.getIncome());
		
		
	


		
		
		return pos;
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
	@Transactional
	public void updateProperty(Property pobj) {
		System.out.println("PropertyRepositoryImpl : Updating Property...");
		super.merge(pobj);
		
	}

	@Transactional
	public void deleteProperty(int propertyId) {
		System.out.println("PropertyRepositoryImpl : Deleting property");
		super.remove(Customer.class, propertyId);
	}

	

	/*@Transactional
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
	}*/
  
}
