package com.SocialAPI.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	Location location1 = new Location("l1", "Mukalla", " this branch is considered as main");
	Location location2 = new Location("l2", "Aden", " this branch is established as second branch");
	Location location3 = new Location("l3", "Sanaa"," this branch is established as third branch");	
	Location location4 = new Location("l4", "Taiz"," this branch is founded after all branches");		
	
	private List <Location> locations= Arrays.asList(location1, location2, location3, location4);
	
	public List <Location> getAllLocations() {
		
		return locations;
	}
	

}
