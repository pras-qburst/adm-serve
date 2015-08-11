package com.store;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AdminWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       
        registry.addViewController("/login").setViewName("login");
        
       
    }
    
   /* @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    	String myExternalFilePath = "file:///C:/Dev/img/";
       
          // LOG.info("Serving static content from " + myExternalFilePath);
           registry.addResourceHandler("/img/**").addResourceLocations("file:" + myExternalFilePath);
       
    }*/

}