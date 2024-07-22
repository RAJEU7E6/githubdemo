package com.demo.githubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Welcome to githubaction demo";
	}

}
