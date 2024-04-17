package com.netzwerk.ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.netzwerk.ecomm.repository")
public class EcommApplication {

	public static void main(String[] args) {

		System.out.println("starting app");
		SpringApplication.run(EcommApplication.class, args);
		System.out.println("Running app");
	}

}
