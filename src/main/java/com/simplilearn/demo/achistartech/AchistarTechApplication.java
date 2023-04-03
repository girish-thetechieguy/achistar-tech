package com.simplilearn.demo.achistartech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@SpringBootApplication
@RestController
public class AchistarTechApplication {

	public static Logger logger = LoggerFactory.getLogger(AchistarTechApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AchistarTechApplication.class, args);
	}

	@PostConstruct
	public void init(){
		logger.info("Application started......");
	}

	@RequestMapping("/")
	public String homepage(){
		logger.info("Application starting......");
		return "Hi all! Welcome to Simplilearn assignment!";
	}
}
