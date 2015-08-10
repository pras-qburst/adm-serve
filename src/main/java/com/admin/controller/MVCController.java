package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MVCController {

	@RequestMapping(method = RequestMethod.GET, value="/admin")
	public String home() {
		return "service";
	}
	@RequestMapping(method = RequestMethod.GET, value="/")
	public String defaultContext() {
		return "service";
	}

}
