package com.SocialAPI.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SocialAPI.location.Location;

@Service
public class UserService {
	
	User user1 = new User(
			"u1", 
			"Ahmed", 
			"Omar",
			new Location("l1", "Mukalla"," this branch is considered as main"),
			"ahmed@gmail.com");
			
		User user2 = new User(
			"Ui", 
			"Hassan", 
			"Ali",
			new Location("l2", "Aden", " this branch is established as second branch"),
			"hassan@gmail.com");
			
		private List<User> users= Arrays.asList(user1, user2);
		
		public List<User> getAllUsers() {
			return users;
		}

}
