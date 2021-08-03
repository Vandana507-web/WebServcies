package com.in28minutes.spring.basics.springinsteps;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	
	private static List<User> users= new ArrayList<>();
	
	static {
		users.add(new User(1 , "ADam",new Date()));
		users.add(new User(2 , "Sham",new Date()));
		users.add(new User(3 , "Jack",new Date()));
		
	}

	
	public List<User> findEverything(){
		return users;
		
	}
	
	public User saveUser(User user) {
		return user;
	}
	 
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
			
		}
		return null;
	}
}
