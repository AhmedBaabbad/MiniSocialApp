package com.SocialAPI.post;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = "/posts/{id}")
	public Post getPost(@PathVariable String id) {
		return postservice.getPost(id);

	}
	@RequestMapping(method=RequestMethod.POST, value="/posts")
	public void addPost (@RequestBody Post post)
	{
		postservice.addPost(post);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/posts/{id}")
	public void deletePost(@PathVariable String id)
	{
		postservice.deletePost(id);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/posts/{id}")
	public void updatePost (@RequestBody Post post, @PathVariable String id)
	{
		postservice.updatePost(post, id);
	}

}
