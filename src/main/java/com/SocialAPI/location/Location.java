package com.SocialAPI.location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCATION")
public class Location {
	
	@Id
	@Column(name="locationId")
	   private String id;
	@Column(name="NAME")
	   private String name;
	@Column(name="DESC")
	   private String desc;
	public Location(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc=desc;
	}
	public Location () {
		// constructor empty
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
