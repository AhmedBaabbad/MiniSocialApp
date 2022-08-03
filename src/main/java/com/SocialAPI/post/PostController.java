package com.SocialAPI.post;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialAPI.location.Location;
import com.SocialAPI.user.User;

@RestController
public class PostController {

	@RequestMapping(value = "/posts")
	   public List<Post> getAllPosts() {
		
		User user1 = new User(
				"u1", 
				"Ahmed", 
				"Omar",
				new Location("l1", "Mukalla"," this branch is considered as main" ),
				"ahmed@gmail.com");
				
			User user2 = new User(
				"Ui", 
				"Hassan", 
				"Ali",
				new Location("l2", "Aden", " this branch is established as second branch"),
				"hassan@gmail.com");
			
			Post post1 = new Post(
					"p1",
					"03-Aug-22",
					user1,
				        "Its good to love and be loved", "General");
					
				Post post2 = new Post(
					"p2",
				        "03-Aug-22",
					user2,
					"We all need someone","specifed");	
				return Arrays.asList(post1,post2);
		
	}
		
	
}