package com.clinica.modelo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler(NullPointerException.class)
	public String nullPointerExeption(NullPointerException e, Model model) {
		
		model.addAttribute("error", "Algo no salio como se esperaba");
		model.addAttribute("mensaje", e.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		
		return "error/null";
	}
}
