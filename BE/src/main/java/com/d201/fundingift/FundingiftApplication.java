package com.d201.fundingift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class FundingiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundingiftApplication.class, args);
	}

}