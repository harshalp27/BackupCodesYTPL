package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.UserDetails;
import org.arpit.java2blog.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
	
	@Autowired
	UserDetailsService UserDetailsService;
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, headers = "Accept=application/json")
	
	public @ResponseBody List<UserDetails> getUsers() {
		
		List<UserDetails> listOfUsers = UserDetailsService.getAllUsers();
		return listOfUsers;
	}

	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public UserDetails getUserById(@PathVariable int id) {
		return UserDetailsService.getUser(id);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addUser(@RequestBody UserDetails user) {	
		UserDetailsService.addUser(user);
		
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateUser(@RequestBody UserDetails user) {
		UserDetailsService.updateUser(user);
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteUser(@PathVariable("id") int id) {
		UserDetailsService.deleteUser(id);		
	}	
}
