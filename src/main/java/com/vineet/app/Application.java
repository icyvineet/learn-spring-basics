package com.vineet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vineet.config.AppConfig;
import com.vineet.service.GreetingsService;

public class Application {
		
	public static void main(String[] args) {

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		acac.getBean(GreetingsService.class).greet();
		
		
	}
}
