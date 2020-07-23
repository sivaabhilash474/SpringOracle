package com.spring.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "com.spring.oracle.*" })
public class SpringOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOracleApplication.class, args);
	}

}
