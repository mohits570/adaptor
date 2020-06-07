package com.issues.adaptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AdaptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdaptorApplication.class, args);
	}

}
