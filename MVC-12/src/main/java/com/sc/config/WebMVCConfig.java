package com.sc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
@Configuration
public class WebMVCConfig {

	@Bean
	public TilesConfigurer createTilesConfigurer() {
	    TilesConfigurer configurer = new TilesConfigurer();
	   // configurer.setDefinitions("/webapp/WEB-INF/tiles.xml");
	    return configurer;
	}

	
	@Bean
	public TilesViewResolver createTVR() {
		TilesViewResolver resolver = new TilesViewResolver();
		return resolver;
	}
	
}
