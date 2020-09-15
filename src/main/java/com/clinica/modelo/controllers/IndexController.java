package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String indexEmpty() {
 
		return "index";
	}

	@RequestMapping("/index")
	public String index() {
		
		return indexEmpty();
	}

	@RequestMapping("/home")
	public String home() {
		
		return indexEmpty();
	}
}
