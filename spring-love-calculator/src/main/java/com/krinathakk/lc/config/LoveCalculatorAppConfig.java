package com.krinathakk.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.krinathakk.lc.controller")
public class LoveCalculatorAppConfig {
	// set up view resolver
	
	@Bean
	public InternalResourceViewResolver viewresolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("WEB-INF/view/");
		vr.setSuffix(".jsp");
	return vr;
	}
	
}
