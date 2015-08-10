package com.admin;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       
    	//registry.addViewController("/").setStatusCode(HttpStatus.NOT_FOUND);
        registry.addViewController("/login").setViewName("login");
        
       
    }

}