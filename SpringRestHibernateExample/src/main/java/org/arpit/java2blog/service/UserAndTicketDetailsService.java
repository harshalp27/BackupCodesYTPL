package org.arpit.java2blog.service;

import java.util.List;

import org.arpit.java2blog.dao.TicketDetailsDao;
import org.arpit.java2blog.model.TicketDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userAndTicketDetailsService")
public class UserAndTicketDetailsService {

	@Autowired
	TicketDetailsDao ticketDetailsDao;
	
	@Transactional
	public List<TicketDetails> getAllTickets() {
		return ticketDetailsDao.getAllTickets();
	}

	@Transactional
	public TicketDetails getTicket(int id) {
		return ticketDetailsDao.getTicket(id);
	}

	@Transactional
	public void addTicket(TicketDetails ticket) {
		ticketDetailsDao.addTicket(ticket);
	}

	@Transactional
	public void updateTicket(TicketDetails ticket) {
		ticketDetailsDao.updateTicket(ticket);

	}

	@Transactional
	public void deleteTicket(int id) {
		ticketDetailsDao.deleteTicket(id);
	}
}
