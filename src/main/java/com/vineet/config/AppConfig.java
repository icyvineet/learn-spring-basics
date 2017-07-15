package com.vineet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.vineet"})
@PropertySource(value="classpath:/environment/dev/conf.properties")
@PropertySource(value="classpath:/environment/${ENV:dev}/conf.properties")
public class AppConfig {

}
