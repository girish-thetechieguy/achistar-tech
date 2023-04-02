package com.simplilearn.demo.achistartech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AchistarTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchistarTechApplication.class, args);
	}

	@RequestMapping("/")
	public String homepage(){
		return "Hi all! Welcome to Simplilearn assignment!";
	}
}
