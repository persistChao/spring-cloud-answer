package com.answer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class , HibernateJpaAutoConfiguration.class})
public class BootJpaRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJpaRedisApplication.class, args);
	}

}

