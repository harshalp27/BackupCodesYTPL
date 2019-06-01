package org.arpit.java2blog.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.model.TicketDetails;
import org.arpit.java2blog.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
@Transactional
	public List<TicketDetails> getAllTickets() {
	System.out.println("!!!!!!!!!!!!!!!1");
		Session session = this.sessionFactory.getCurrentSession();
		List<TicketDetails> ticketsList = session.createQuery("from TicketDetails").list();
		return ticketsList;
	}

	public TicketDetails getTicket(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		TicketDetails ticket = (TicketDetails) session.load(TicketDetails.class, new Integer(id));
		return ticket;
	}

	public TicketDetails addTicket(TicketDetails ticket) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(ticket);
		return ticket;
	}

	public void updateTicket(TicketDetails ticket) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(ticket);
	}

	public void deleteTicket(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		TicketDetails p = (TicketDetails) session.load(TicketDetails.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
