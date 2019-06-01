package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.TicketDetails;
import org.arpit.java2blog.service.TicketDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketDetailsController {
	
	@Autowired
	TicketDetailsService ticketDetailsService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getAllTickets", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<TicketDetails> getAllTickets() {
		
		List<TicketDetails> listOfTickets = ticketDetailsService.getAllTickets();
		return listOfTickets;
	}

	@RequestMapping(value = "/getTicket/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public TicketDetails getTicketById(@PathVariable int id) {
		return ticketDetailsService.getTicket(id);
	}

	@RequestMapping(value = "/addTicket", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addTicket(@RequestBody TicketDetails ticket) {	
		ticketDetailsService.addTicket(ticket);
		
	}

	@RequestMapping(value = "/updateTicket", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateUser(@RequestBody TicketDetails user) {
		ticketDetailsService.updateTicket(user);
	}

	@RequestMapping(value = "/deleteTicket/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteUser(@PathVariable("id") int id) {
		ticketDetailsService.deleteTicket(id);		
	}	
}
