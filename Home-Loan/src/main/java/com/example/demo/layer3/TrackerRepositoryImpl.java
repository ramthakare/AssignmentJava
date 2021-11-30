package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.Tracker;
@Repository
public class TrackerRepositoryImpl extends BaseRepository implements TrackerRepository{

	@Transactional
	public void insertTracker(Tracker Tobj) {
		super.persist(Tobj); // invoking the dummy persist of the super class
		System.out.println("Tracker inserted...");
		
	}

	@Override
	public Tracker selectTracker(int Tracker_Id) {
		System.out.println("TrackerRepositoryImpl : selecting Tracker  by Tracker_Id");
		Tracker tracker = super.find(Tracker.class, Tracker_Id);
		System.out.println("repo : tracker "+tracker);
		
		
		System.out.println("tracker  :"+tracker.getTracker_Id());
		System.out.println("tracker  :"+tracker.getStatus());
		System.out.println("tracker  :"+tracker.getApprovedDate());
		
		
		
		
	


		
		
		return tracker;
	}

	@Override
	public List<Tracker> selectTrackers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateTracker(Tracker Tobj) {
		System.out.println("TrackerRepositoryImpl : Updating Tracker...");
		super.merge(Tobj);
	}

	@Transactional
	public void deleteTracker(int Tracker_Id) {
		System.out.println("TrackerRepositoryImpl : Deleting Tracker");
		super.remove(Tracker.class, Tracker_Id);
	}

}
