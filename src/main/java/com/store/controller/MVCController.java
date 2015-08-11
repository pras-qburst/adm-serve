package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * MVC Controller to receive Web Request.
 * @author prasanth
 *
 */

@Controller
public class MVCController {

	/**
	 * Present the service page on /demo request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value="/demo")
	public String home() {
		return "service";
	}
	
	/**
	 * Present the service page on / request
	 * @return
	 */
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public String defaultContext() {
		return "service";
	}
	

}
