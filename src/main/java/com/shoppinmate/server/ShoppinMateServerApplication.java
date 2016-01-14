package com.shoppinmate.server;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppinMateServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppinMateServerApplication.class, args);
    }
    
    @Bean
	public ServletContextInitializer servletContextInitializer() {
	    return new ServletContextInitializer() {
			
	        @Override
	        public void onStartup(ServletContext servletContext) throws ServletException {
	            servletContext.getSessionCookieConfig().setName("session_id");
	        }
	    };
	
	}

}
