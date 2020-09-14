package com.kt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kt.formatter.AmountFormatter;
import com.kt.formatter.CreditCardFormatter;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.kt.controller")
public class BillingAppConfig implements WebMvcConfigurer {
	// set up view resolver
	
		@Bean
		public InternalResourceViewResolver viewresolver() {
			InternalResourceViewResolver vr = new InternalResourceViewResolver();
			vr.setPrefix("/WEB-INF/view/");
			vr.setSuffix(".jsp");
		return vr;
		}
		
		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addFormatter(new CreditCardFormatter());
			registry.addFormatter(new AmountFormatter());
		}

}
