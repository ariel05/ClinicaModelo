package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InternacionController {

	@RequestMapping("/solicitudInternacion")
	public String solicitudInternacion() {
		
		return "internacion/solicitudInternacion";
	}
	
	@RequestMapping("/consultaAutorizaciones")
	public String consultaAutorizaciones() {
		
		return "internacion/consultaAutorizaciones";
	}

	@RequestMapping("/consultaInternaciones")
	public String consultaInternaciones() {
		
		return "internacion/consultaInternaciones";
	}

	@RequestMapping("/egresoInternacion")
	public String egresoInternacion() {
		
		return "internacion/egresoInternacion";
	}

}
