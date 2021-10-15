package com.storeServer.storeServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StoreServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreServerApplication.class, args);
		System.out.println("Server running on port 8080..");
	}
	
	@GetMapping("/")
	public String root() {
		return "Electronic store server running...";
	}

}
