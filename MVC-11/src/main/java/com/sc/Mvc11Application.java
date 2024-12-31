package com.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class Mvc11Application {

	@Bean
	public BeanNameViewResolver BNVR() {
		BeanNameViewResolver resolver= new BeanNameViewResolver();
		resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return resolver;
		
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(Mvc11Application.class, args);
	}

}
