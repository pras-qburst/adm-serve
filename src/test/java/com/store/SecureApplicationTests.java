package com.store;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.store.ApplicationStart;
import com.store.SecurityConfig;
import com.store.SecureApplicationTests.TestConfiguration;
import com.store.service.CategoriesService;

/**
 * Basic integration tests for demo application.
 *
 * @author Prasanth
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { ApplicationStart.class,
		SecurityConfig.class })
public class SecureApplicationTests {
	@Autowired
	private CategoriesService service;
	@Autowired
	private ApplicationContext context;
	private Authentication authentication;

	@Before
	public void init() {
		AuthenticationManager authenticationManager = this.context
				.getBean(AuthenticationManager.class);
		this.authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken("admin",
						"admin"));
	}

	@After
	public void close() {
		SecurityContextHolder.clearContext();
	}

	@Test(expected = AuthenticationException.class)
	public void secure() throws Exception {
		this.service.getCategoriesForChannel("04");
		
	}

	@Test
	public void authenticated() throws Exception {
		SecurityContextHolder.getContext().setAuthentication(
				this.authentication);
		org.junit.Assert.assertNotNull(this.service
				.getCategoriesForChannel("04"));

	}


	@PropertySource("classpath:application-test.properties")
	@Configuration
	protected static class TestConfiguration {
	}
}
