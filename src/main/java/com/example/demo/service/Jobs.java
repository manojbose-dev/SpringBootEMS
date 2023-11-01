package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Jobs {
	
	@Scheduled(cron = "0/3 * * * * *")
	public void hi() {
		System.out.println("Hello Manoj");
	}
}
