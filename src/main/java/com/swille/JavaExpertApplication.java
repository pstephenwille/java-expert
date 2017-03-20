package com.swille;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExpertApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaExpertApplication.class, args);
		People steve = new  People();
		steve.setName("steve");
		System.out.println(steve.getName());
	}


}
