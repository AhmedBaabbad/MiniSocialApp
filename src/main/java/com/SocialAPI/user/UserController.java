package com.SocialAPI.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialAPI.location.Location;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/users")
	public List<User> getAllUsers() {
		
		return userService.getAllUsers();
		
	}

}
