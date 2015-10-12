package org.nazar.mubeen.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_DETAILS")
public class UserDetails {

	@Id
	@Column(name="user_id")
	private int userid;
	@Column(name="user_name")
	private String username;
	private String address;
	private Date joineddate;
	private String description;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getJoineddate() {
		return joineddate;
	}
	public void setJoineddate(Date joineddate) {
		this.joineddate = joineddate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
