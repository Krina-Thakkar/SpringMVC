package com.kt.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class BillingAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(BillingAppConfig.class);
		
		// create a dispatcher servlet object
		DispatcherServlet dispatcherservlet = new DispatcherServlet(webApplicationContext);
		
		// register dispatcher servlet with servlet context
		ServletRegistration.Dynamic mycustomdispatcher = servletContext.addServlet("myCustomDispatcherServlet", dispatcherservlet);
		mycustomdispatcher.setLoadOnStartup(1);
		mycustomdispatcher.addMapping("/");

	}

}
