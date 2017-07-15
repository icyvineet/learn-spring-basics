package com.vineet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vineet.service.GreetingsService;
import com.vineet.service.display.Display;

@Service
public class GoodMorningService implements GreetingsService {

	@Autowired
	@Qualifier("displayLED")
	Display disp;
	
	
	public String greet() {
		String ret = "Good Morning Greeting";
		System.out.println("GoodMorningService Returning - ");
		
		System.out.println(disp.show());
		return ret;
	}

}
