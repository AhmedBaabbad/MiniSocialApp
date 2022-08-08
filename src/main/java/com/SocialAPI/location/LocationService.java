package com.SocialAPI.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	Location location1 = new Location("l1", "Mukalla", " this branch is considered as main");
	Location location2 = new Location("l2", "Aden", " this branch is established as second branch");
	Location location3 = new Location("l3", "Sanaa"," this branch is established as third branch");	
	Location location4 = new Location("l4", "Taiz"," this branch is founded after all branches");		
	
	// use this code when you dont have add location by Post Method
	//private List <Location> locations= Arrays.asList(location1, location2, location3, location4);
	
	// use this code when you want to add new location through POST method 
	List<Location> locations = new ArrayList<>(Arrays.asList(location1, location2, location3,location4));
	
	public List <Location> getAllLocations() {
		
		return locations;
	}
	
	public Location getLocation(String id) {
	    Location location = locations.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
	    
	    return location;
	}
	
	public void addLocation (Location location)	
	{
		locations.add(location);
	}
	
	public void deleteLocation (String id)	
	{
		locations.removeIf(t-> t.getId().equals(id));
	}
	public void updateLocation (String id, Location location)	
	{
		for (int i=0 ; i<locations.size(); i++)
		{
			Location l= locations.get(i);
			if (l.getId().equals(id)) {
				locations.set(i, location);
			}
		}
	}

}
