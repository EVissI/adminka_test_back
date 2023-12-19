package com.example.adminka_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = { "*" })

public class AdminkaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminkaTestApplication.class, args);
	}

}
