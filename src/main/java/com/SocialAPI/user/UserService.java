package com.SocialAPI.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SocialAPI.location.Location;
import com.SocialAPI.student.Student;
import com.SocialAPI.student.StudentRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList();
		userRepository.findAll()
		.forEach(users::add);
		return users;
	}
	
	public void addUser(User user)
	{
		userRepository.save(user);
	}
	
	public Optional<User> getUser(String id)
	{
		return userRepository.findById(id);
	}
	
	public void updateUser (String id, User user) 
	{
		userRepository.save(user);
	}
	public void deleteUser(String id) 
	{
		userRepository.deleteById(id);
	}
	
	public List<User> getUserByLocation(String id)
	{
		List<User> users= new ArrayList<>();
		userRepository.findByLocationId(id)
		.forEach(users:: add);
		return users;
	}
	
	/*User user1 = new User(
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
		
		// use this code when you dont have add location by Post Method
		//private List<User> users= Arrays.asList(user1, user2);
		
		// use this code when you want to add new location through POST method 
		List <User> users= new ArrayList<>(Arrays.asList(user1, user2));
		
		public List<User> getAllUsers() {
			return users;
		}
		
		public User getUser (String id) {
			
			User user = users.stream()
					.filter(t -> id.equals(t.getId()))
					.findFirst()
					.orElse(null);
			return user;
		}
		
		public void addUser(User user) {
			
			users.add(user);
		}
		
		public void deleteUser (String id)	
		{
			users.removeIf(t-> t.getId().equals(id));
		}
		public void updateUser(User user, String id)
		{
			for(int i=0;i<users.size();i++)
			{
				User u=users.get(i);
				if(u.getId().equals(id))
				{
					users.set(i,user);
				}
			}
		}
*/

}
