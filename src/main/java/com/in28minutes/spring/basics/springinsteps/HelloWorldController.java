package com.in28minutes.spring.basics.springinsteps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "hello";
		
	}
	
	@GetMapping(path="/helloworldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HelloMe");
	}

	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello path,%s",name));
		
		
		
	}
	
	
}

