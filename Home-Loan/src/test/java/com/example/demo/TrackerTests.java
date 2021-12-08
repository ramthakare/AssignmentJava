package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Property;
import com.example.demo.layer2.Tracker;
import com.example.demo.layer3.TrackerRepositoryImpl;

@SpringBootTest
public class TrackerTests {

	@Autowired
	TrackerRepositoryImpl trackerRepo;
	@Test
	void insertTrackerTest()
	{
		Tracker tracker=new Tracker();
		
		tracker.setTracker_Id(26);
		tracker.setApprovedDate(LocalDate.of(2023, 01, 27));
		tracker.setStatus("Not Approval");
		trackerRepo.insertTracker(tracker);
	}
	
	
	@Test
	void selectTrackerTest()
	{
		Tracker tracker;
		tracker=trackerRepo.selectTracker(24);
System.out.println("repo : tracker "+tracker);
		
		
		System.out.println("tracker  :"+tracker.getTracker_Id());
		System.out.println("tracker  :"+tracker.getStatus());
		System.out.println("tracker  :"+tracker.getApprovedDate());
		
	}
	
	@Test
	void selectAllTrackerTest()
	{
		List<Tracker> trackerList;
		trackerList=trackerRepo.selectTrackers();
		for(Tracker tracker :trackerList)
		{
			
			System.out.println("tracker  :"+tracker.getTracker_Id());
			System.out.println("tracker  :"+tracker.getStatus());
			System.out.println("tracker  :"+tracker.getApprovedDate());
			
			
			System.out.println("---------------------------------------------------------------");
			
		
			
		}
		
		
		

		
	}
	
}
