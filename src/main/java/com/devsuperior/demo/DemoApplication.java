package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	/*
	@Autowired
	private PasswordEncoder passwordEncoder;
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Encode = " + passwordEncoder.encode("123456"));
		boolean result = passwordEncoder.matches("123456", "$2a$10$4guDZ7oXLS1M6wucj9L4p.2xqIhWqi0o0Df/iZ1f5WDl0TO4rhlqe");
		System.out.println("Resultado = " + result);
	}
	 */
}