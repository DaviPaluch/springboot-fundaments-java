package com.paluch.spring_fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.paluch")
public class SpringFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsApplication.class, args);
	}

}
