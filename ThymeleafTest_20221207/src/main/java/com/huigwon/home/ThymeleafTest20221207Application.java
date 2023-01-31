package com.huigwon.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ThymeleafTest20221207Application {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafTest20221207Application.class, args);
	}

}
