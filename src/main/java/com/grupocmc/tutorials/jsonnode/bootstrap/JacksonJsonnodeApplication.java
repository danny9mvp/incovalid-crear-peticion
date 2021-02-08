package com.grupocmc.tutorials.jsonnode.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupocmc.tutorials.jsonnode.mapper","com.grupocmc.tutorials.jsonnode.api","com.grupocmc.tutorials.jsonnode.mapper.impl"})
public class JacksonJsonnodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacksonJsonnodeApplication.class, args);
	}

}
