package com.clinica.modelo.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class IndexController {

	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
}
