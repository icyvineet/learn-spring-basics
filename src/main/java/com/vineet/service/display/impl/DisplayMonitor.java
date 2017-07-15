package com.vineet.service.display.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vineet.service.display.Display;

@Component
public class DisplayMonitor implements Display {


	@Value("${first.name}")
	private String firstName;


	@Value("${last.name}")
	private String lasttName;

	
	public String show() {
		// TODO Auto-generated method stub
		return firstName + " " + lasttName + "  says --  Display shows Monitor";
	}
}
