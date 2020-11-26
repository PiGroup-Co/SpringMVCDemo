package com.springmvcdemocontroller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
}