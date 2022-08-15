package com.SocialAPI.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SocialAPI.location.Location;
import com.SocialAPI.location.LocationRepository;
import com.SocialAPI.user.User;

@Service
public class PostService {
	
	@Autowired
	public PostRepository postRepository;
	
	public List<Post> getAllPosts() {
		
		List<Post> posts = new ArrayList<>();
		
		postRepository.findAll()
		.forEach(posts::add);
		
		return posts;		
	}
		
	public void addPost(Post post) {
		postRepository.save(post);
	}
		
	public Optional<Post> getPost(String id) {
		return postRepository.findById(id);
	}
	
	public void deletePost(String id) {
		postRepository.deleteById(id);
	}
	
	public void updatePost(String id, Post post) {
		postRepository.save(post);
	}
	public List<Post> getPostByUser(String id)
	{
		List<Post> posts= new ArrayList<>();
		postRepository.findByUserId(id)
		.forEach(posts:: add);
		return posts;
	}
	/*User user1 = new User(
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
			
			//private List<Post> posts= Arrays.asList(post1,post2);
			
			List<Post> posts= new ArrayList<>(Arrays.asList(post1, post2));
			
			public List<Post> getAllPosts ()
			{
				return posts;
				
			}
			
			public Post getPost(String id) {
		    	Post post = posts.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
			return post;
		}
			public void addPost(Post post)
			{
				posts.add(post);
			}
			public void deletePost (String id)	
			{
				posts.removeIf(t-> t.getId().equals(id));
			}
			
			public void updatePost(Post post, String id)
			{
				for(int i=0; i<posts.size(); i++) 
				{
					Post p=posts.get(i);
					if(p.getId().equals(id))
					{
						posts.set(i, post);
					}
				}
			}

	*/

}
