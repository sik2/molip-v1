package com.ll.molipv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MolipV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MolipV1Application.class, args);
	}

}
