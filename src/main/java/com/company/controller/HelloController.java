package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
//		model.addAttribute("message", "Hello world!");
		return "index";
	}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
//		model.addAttribute("message", "Hello world!");
		return "index";
	}
}