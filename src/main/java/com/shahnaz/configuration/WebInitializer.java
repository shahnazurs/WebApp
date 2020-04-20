package com.shahnaz.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext)
	{
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebConfig.class);
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(rootContext));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		ServletContainer servletContainer = new ServletContainer();
		ServletRegistration.Dynamic jerseyServlet = servletContext.addServlet("jerseyServlet", servletContainer);
		jerseyServlet.setInitParameter("jersey.config.server.provider.packages", "com.shahnaz.ws");
		jerseyServlet.addMapping("/rs/*");
		jerseyServlet.setLoadOnStartup(1);

	}

}
