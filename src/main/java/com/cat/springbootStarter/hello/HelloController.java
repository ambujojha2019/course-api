package com.cat.springbootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String sayHi() {
		System.out.println("Hi");
		return "Hi";
	}

}
