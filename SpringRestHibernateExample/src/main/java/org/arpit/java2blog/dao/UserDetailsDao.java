package org.arpit.java2blog.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.model.UserDetails;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Transactional
	public List<UserDetails> getAllUsers() {
		System.out.println("!!!!!!!!!!!!!!!1");
		Session session = this.sessionFactory.getCurrentSession();
		List<UserDetails> usersList = session.createQuery("from UserDetails").list();
		return usersList;
	}
	
	public UserDetails getUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserDetails user = (UserDetails) session.load(UserDetails.class, new Integer(id));
		return user;
	}

	public UserDetails addUser(UserDetails user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		return user;
	}

	public void updateUser(UserDetails user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
	}

	public void deleteUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserDetails p = (UserDetails) session.load(UserDetails.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
