package com.in28minutes.spring.basics.springinsteps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findEverything();
	}
	
	@GetMapping("/user/path-variable/{id}")
	public User retrieveUSer(@PathVariable int id){
		return service.findOne(id);
		
	}

	@PostMapping("/createdUser")
	public User postUser(@RequestBody User user) {
		return service.saveUser(user);
	}
}
