package com.SocialAPI.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialAPI.location.Location;

@RestController
public class UserController {
	@RequestMapping(value="/users")
	public List<User> getAllUsers() {
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
				
			return Arrays.asList(user1, user2);
	}

}
