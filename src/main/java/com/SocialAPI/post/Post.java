package com.SocialAPI.post;

import com.SocialAPI.user.User;

public class Post {
	
	 private String id;
	   private String postdate;
	   private User user;
	   private String details;
       private String type;
	public Post(String id, String postdate, User user, String details, String type) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
		this.type = type;   
}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
