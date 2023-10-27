package com.notes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.entity.Users;
import com.notes.services.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService user;
	
	
	@GetMapping(path="/users/count")
	public long getUserCount() {
		return this.user.getUserCount();
	}
	
	@PostMapping(path="/users",consumes= {"application/json"})
	public boolean addUsers(@RequestBody Users user) 
	{
		return this.user.addUsers(user);
		
	}
	

	@RequestMapping("/users/{email}")
	public Optional<Users> getlogin(@PathVariable("email") String email)
	{
		return this.user.getlogin(email);

	}
	
	
}
