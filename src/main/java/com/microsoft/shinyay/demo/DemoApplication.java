package com.microsoft.shinyay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class DemoApplication {

	@EnableJpaRepositories(basePackages = "com.microsoft.shinyay.demo.repository")
	@EntityScan(basePackages = "com.microsoft.shinyay.demo.entity")
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
