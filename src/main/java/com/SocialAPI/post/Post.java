package com.SocialAPI.post;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.SocialAPI.user.User;

@Entity
@Table(name="POST")
public class Post {
	@Id
	@Column(name="postId")
	 private String id;
	@Column(name="POSTDATE")
	   private String postdate;
	   @ManyToOne
	   private User user;
	@Column(name="DETAILS")
	   private String details;
	@Column(name="TYPE")
       private String type;
	public Post(String id, String postdate, User user, String details, String type) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
		this.type = type;   
}
	
	public Post () {
		// empty
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
