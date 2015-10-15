package org.nazar.mubeen.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name="USER_DETAILS")
public class UserDetails {

	@Id @GeneratedValue
	@Column(name="user_id")
	private int userid;
	@Column(name="user_name")
	private String username;
	@ElementCollection
	@JoinTable(name="user_address", joinColumns=@JoinColumn(name="user_id")
	
			)
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="address_id") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listofaddresses=new ArrayList();
	
	private Date joineddate;
	private String description;


	
	public Collection<Address> getListofaddresses() {
		return listofaddresses;
	}
	public void setListofaddresses(Collection<Address> listofaddresses) {
		this.listofaddresses = listofaddresses;
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
