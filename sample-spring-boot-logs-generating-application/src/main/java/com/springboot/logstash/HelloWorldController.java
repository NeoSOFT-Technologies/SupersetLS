package com.springboot.logstash;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/hello")
	public String helloMessage() {
		logger.debug("helloMessage() method called {} and status {}",new Date(),200);
		return "Hello World";
	}
}
