package com.mailorderpharmacy.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
public class AuthService {

	public static void main(String[] args) {
		SpringApplication.run(AuthService.class, args);
	}

}
