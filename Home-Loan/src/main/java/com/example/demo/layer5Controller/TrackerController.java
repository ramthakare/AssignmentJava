package com.example.demo.layer5Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Tracker;
import com.example.demo.layer3.TrackerRepositoryImpl;

@RestController
@RequestMapping("/tracker")
public class TrackerController {

	@Autowired
	TrackerRepositoryImpl trackerRepo;
	
	@RequestMapping("/gettracker/{Tracker_Id}")//localhost:8080/cust/getCust
	public Tracker getTracker(@PathVariable("Tracker_Id") int x)
	{
		Tracker tracker = null;
		tracker=trackerRepo.selectTracker(x);
		
		System.out.println("controller : tracker : "+tracker.getTracker_Id());
		return tracker;
	}
	@RequestMapping("/getAll")//localhost:8080/cust/getAll
	public List<Tracker> gettrackers()
	{
		System.out.println("getAll");
		List<Tracker> trackerList;
		trackerList=trackerRepo.selectTrackers();
		return trackerList;
	}
}
