package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

public class TrafficFortuneService {

	
	public String getFortune() {
		
		//Simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//Return a fortune
		return "Expect heavy traffic this morning";
	}
	
}
