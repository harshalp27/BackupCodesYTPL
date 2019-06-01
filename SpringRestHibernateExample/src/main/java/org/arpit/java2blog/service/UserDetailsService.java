package org.arpit.java2blog.service;

import java.util.List;

import org.arpit.java2blog.dao.UserDetailsDao;
import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserDetailsService {

	@Autowired
	UserDetailsDao userDetailsDao;
	
	@Transactional
	public List<UserDetails> getAllUsers() {
		return userDetailsDao.getAllUsers();
	}

	@Transactional
	public UserDetails getUser(int id) {
		return userDetailsDao.getUser(id);
	}

	@Transactional
	public void addUser(UserDetails user) {
		userDetailsDao.addUser(user);
	}

	@Transactional
	public void updateUser(UserDetails user) {
		userDetailsDao.updateUser(user);

	}

	@Transactional
	public void deleteUser(int id) {
		userDetailsDao.deleteUser(id);
	}
}
