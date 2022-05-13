package com.springboot.logstash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedular {

	private final Logger logger=LoggerFactory.getLogger(Schedular.class);
	
	@Scheduled(fixedDelay = 2000)
	public void addinglogs()
	{
		logger.info("Request Passed , statusCode : 200 ");
		logger.warn("Request has Warning , statusCode : 201 ");
		logger.error("Request not passed , status code: 400");
		logger.error("Request not passed , status code: 404");
		logger.error("Request not passed , status code: 500");
		try {
			int a=1/0;
		}
		catch(Exception e) {
			logger.error("Error!! {}",e.toString());
		}
		}
}