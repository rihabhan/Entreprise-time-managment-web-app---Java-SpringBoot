package com.enit.ProjectSpring11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class ProjectSpring11Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpring11Application.class, args);
	}

}
