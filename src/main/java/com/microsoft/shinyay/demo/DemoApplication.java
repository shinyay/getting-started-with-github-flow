package com.microsoft.shinyay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DemoApplication {

	@EnableJpaRepositories(basePackages = "com.microsoft.shinyay.demo.repository")
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
