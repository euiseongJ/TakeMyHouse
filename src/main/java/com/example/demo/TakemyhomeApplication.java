package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TakemyhomeApplication {
	public static final String LISTERPATH = "/lister";
	public static final String HOUSEPATH = "/house";
	public static void main(String[] args) {
		SpringApplication.run(TakemyhomeApplication.class, args);
	}

}
