package com.clinica.modelo.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
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
