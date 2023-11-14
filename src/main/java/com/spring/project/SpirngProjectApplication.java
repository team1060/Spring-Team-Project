package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * DB 연결 정보가 없을때 
 * @SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpirngProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngProjectApplication.class, args);
	}

}
