package com.SocialAPI.post;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialAPI.location.Location;
import com.SocialAPI.user.User;

@RestController
public class PostController {

	@Autowired
	private PostService postservice;
	@RequestMapping(value = "/posts")
	   public List<Post> getAllPosts() {
		
		return postservice.getAllPosts();
	}
		
	
}
