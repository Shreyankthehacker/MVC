package com.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@SpringBootApplication
public class Mvc10Application {

	
	@Bean
	public ResourceBundleViewResolver createRBVR() {
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		resolver.setBasename("com/sc/commons/views");
		return resolver;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Mvc10Application.class, args);
	}

}
