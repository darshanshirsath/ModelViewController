package com.krishna.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ModelViewController implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(ModelViewControllerConfig.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myDispatcherServlet =  servletContext.addServlet("myDispatcherServlet",dispatcherServlet);
		myDispatcherServlet.setLoadOnStartup(1);
		myDispatcherServlet.addMapping("/mywebsite/*");
	}
	

}
