package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("args = " + args);
		System.out.println("webhook test");
		System.out.println("webhook test2");
		System.out.println("webhook test3");
		System.out.println("webhook test4");
		System.out.println("webhook test5");
	}
	
}
