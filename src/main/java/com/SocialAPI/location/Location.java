package com.SocialAPI.location;

public class Location {
	
	   private String id;
	   private String name;
	   private String desc;
	public Location(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc=desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
