package com.nagesh.JavaExampe1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JavaExampe1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaExampe1Application.class, args);
		System.out.println("Hello Nagesh");
	}

}
