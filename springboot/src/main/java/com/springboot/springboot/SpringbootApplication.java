package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@RestController
public class SpringbootApplication {
	@GetMapping("/message")
public String message() {
	return "Welcome Springboot!";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
