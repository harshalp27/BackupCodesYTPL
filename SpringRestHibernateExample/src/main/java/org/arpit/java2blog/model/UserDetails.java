package org.arpit.java2blog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name = "user_details")
public class UserDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;

	@Column(name = "user_name")
	String userName;

	@Column(name = "user_email")
	String userEmail;
	
	@OneToMany(targetEntity=TicketDetails.class, mappedBy="userDetails")
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade({org.hibernate.annotations.CascadeType.ALL})
	@JsonBackReference
	private List<TicketDetails> ticketDetails;

	public UserDetails() {
		super();
	}

	
	public UserDetails(int userId, String userName, String userEmail, List<TicketDetails> ticketDetails) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.ticketDetails = ticketDetails;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<TicketDetails> getTicketDetails() {
		return ticketDetails;
	}

	public void setTicketDetails(List<TicketDetails> ticketDetails) {
		this.ticketDetails = ticketDetails;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}