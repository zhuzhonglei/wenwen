package com.wenwen.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wenwen.community.dao"})
public class TestCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCommunityApplication.class, args);
	}

}
