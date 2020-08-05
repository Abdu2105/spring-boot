package com.example.sssss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class TeachApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachApplication.class, args);
	}

//	@Scheduled(fixedRate = 1000L)
//	public void startRate(){
//		System.out.println("New lesson " + new Date());
//	}
//
//	@Scheduled(fixedDelay = 1000L)
//	public void startDelay(){
//		System.out.println("New task " + new Date());
//	}

//	@Scheduled(cron = ("10 44 17 * * * ")
//	public void startCron(){
//		System.out.println("New task " + new Date());
//	}

//	@Scheduled(initialDelay = 1000L, fixedDelay = 2000L)
//	public void startRate(){
//		System.out.println("New lesson " + new Date());
//	}

	public void abs(){  }
}
