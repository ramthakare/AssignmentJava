package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Tracker;
@Repository
public interface TrackerRepository {
	 void insertTracker(Tracker Tobj);
	  
	 Tracker selectTracker(int Tracker_Id); //R
		List<Tracker> selectTrackers(); //RA
		
		void updateTracker(Tracker Tobj); //U
		void deleteTracker(int Tracker_Id); //D
}
