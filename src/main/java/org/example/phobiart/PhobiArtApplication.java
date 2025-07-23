package org.example.phobiart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PhobiArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhobiArtApplication.class, args);
	}

}
