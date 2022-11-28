package com.cybage.ohc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.cybage")
@EntityScan(basePackages = "com.cybage.model")
//@EnableJpaRepositories(basePackages = "com.cybage.repository")
public class OnlineHealthCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineHealthCareApplication.class, args);
	}

}
