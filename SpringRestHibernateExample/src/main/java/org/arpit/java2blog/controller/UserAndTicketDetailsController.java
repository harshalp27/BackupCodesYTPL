package org.arpit.java2blog.controller;

import java.util.List;
import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAndTicketDetailsController {
	
	/*@Autowired
	UserDetailsService UserDetailsService;
	
	@RequestMapping(value = "/getAllUsersAndTickets", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		
		List<Country> listOfCountries = UserDetailsService.getAllCountries();
		return listOfCountries;
	}

	@RequestMapping(value = "/getCountry1/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		return UserDetailsService.getCountry(id);
	}

	@RequestMapping(value = "/addCountry1", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCountry(@RequestBody Country country) {	
		UserDetailsService.addCountry(country);
		
	}

	@RequestMapping(value = "/updateCountry1", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCountry(@RequestBody Country country) {
		UserDetailsService.updateCountry(country);
	}

	@RequestMapping(value = "/deleteCountry1/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		UserDetailsService.deleteCountry(id);		
	}	*/
}
