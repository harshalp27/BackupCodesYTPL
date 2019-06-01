package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/*
 * This is our model class and it corresponds to ticket_details table in database
 */
@Entity
@Table(name = "ticket_details")
public class TicketDetails implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "ticket_description")
	String ticketDescription;

	@Column(name = "ticket_status")
	String ticketStatus;
	
	@Column(name = "ticket_assignee")
	String ticketAssignee;

	@ManyToOne(targetEntity=UserDetails.class)
	@LazyToOne(value=LazyToOneOption.FALSE)
	@JoinColumn(name="idUserDetails")
	@JsonManagedReference
	private UserDetails userDetails;
	
	public String getTicketAssignee() {
		return ticketAssignee;
	}

	public void setTicketAssignee(String ticketAssignee) {
		this.ticketAssignee = ticketAssignee;
	}
	public UserDetails getUserdetails() {
		return userDetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userDetails = userdetails;
	}

	public TicketDetails() {
		super();
	}


	public TicketDetails(int id, String ticketDescription, String ticketStatus, String ticketAssignee,
			UserDetails userDetails) {
		super();
		this.id = id;
		this.ticketDescription = ticketDescription;
		this.ticketStatus = ticketStatus;
		this.ticketAssignee = ticketAssignee;
		this.userDetails = userDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

}