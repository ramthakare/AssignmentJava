package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Application_Details;
import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Tracker;

@Repository
public class Application_DetailsRepoImp extends BaseRepository implements Application_DetailsRepo 
{

	@Transactional
	public void insertApplication_Details(Application_Details Aobj) 
	{
		super.persist(Aobj);
		System.out.println("Application_Details insert");
		
	}

	@Override
	public Application_Details selectApplication_Details(int application_No) 
	{
		System.out.println("Application_DetailsRepositoryImpl : selecting Application_Details  by application_No");
		Application_Details application=super.find(Application_Details.class,application_No);
		System.out.println("application_Details  :"+application.getApplication_No());
		System.out.println("application_Details  :"+application.getComments());
		System.out.println("application_Details  :"+application.getExpected_Amount());
		System.out.println("application_Details  :"+application.getStatus());
		System.out.println("application_Details  :"+application.getTenure());
		
		return application;
	}

	@Override
	public List<Application_Details> selectApplication_Details() 
	{
	List<Application_Details>  applicationList = new ArrayList<Application_Details>();

	System.out.println("Application_DetailsRepositoryImpl : Selecting all Application_Details...");
	applicationList =  super.findAll("Application_Details");
	System.out.println("repo : applicationList ref  "+applicationList);
	System.out.println("repo : applicationList size "+applicationList.size());

	for(Application_Details application : applicationList) {
		//System.out.println("repo: dept "+dept.getDepartmentNumber());
		System.out.println("application_Details  :"+application.getApplication_No());
		System.out.println("application_Details  :"+application.getComments());
		System.out.println("application_Details  :"+application.getExpected_Amount());
		System.out.println("application_Details  :"+application.getStatus());
		System.out.println("application_Details  :"+application.getTenure());
		

	}
	
	return applicationList;
	}
	@Transactional
	public void updateApplication_Details(Application_Details Aobj) 
	{
		super.merge(Aobj);
		System.out.println("Application Details Update.......");
	}

	@Transactional
	public void deleteApplication_Details(int application_No) 
	{
		super.remove(Tracker.class, application_No);
	}

}
