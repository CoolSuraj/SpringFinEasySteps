package com.suraj.spring.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.suraj.spring.*"})//this is to be written so that it will scan respective packages
@EnableJpaRepositories(basePackages ={"com.suraj.spring.*"}) //Imp for JPA
@EntityScan("com.suraj.spring.*") //Imp for Scanning 
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
