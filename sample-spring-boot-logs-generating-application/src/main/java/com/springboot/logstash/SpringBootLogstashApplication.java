package com.springboot.logstash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootLogstashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogstashApplication.class, args);
	}

}
