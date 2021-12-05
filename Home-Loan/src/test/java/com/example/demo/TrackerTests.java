package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Tracker;
import com.example.demo.layer3.TrackerRepositoryImpl;

@SpringBootTest
public class TrackerTests {

	@Autowired
	TrackerRepositoryImpl trackerRepo;
	@Test
	void insertProTest()
	{
		Tracker tracker=new Tracker();
		
		tracker.setTracker_Id(24);
		tracker.setApprovedDate(LocalDate.of(2023, 01, 27));
		tracker.setStatus("Not Approval");
		trackerRepo.insertTracker(tracker);
	}
	
}
