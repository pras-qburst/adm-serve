package com.store;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Configuration for default pages 
 * 
 * @author prasanth
 *
 */

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	/**
	 *  configure view mapping for default pages
	 */
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       
        registry.addViewController("/login").setViewName("login");
        
       
    }
    
  

}