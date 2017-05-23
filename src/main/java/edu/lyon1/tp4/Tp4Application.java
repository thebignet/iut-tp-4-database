package edu.lyon1.tp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "edu.lyon1.tp4")
public class Tp4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp4Application.class, args);
	}
}
