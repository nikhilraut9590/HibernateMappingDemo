package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingDemoApplication.class, args);
		System.out.println("Hibernate Demo-App");
	}

}
