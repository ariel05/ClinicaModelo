package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clinica.modelo.helper.ConstantsHelper;

@Controller
public class InternacionController {

	@RequestMapping("/solicitudInternacion")
	public String solicitudInternacion(Model model) {
		if(model.getAttribute(ConstantsHelper.OBJECT_NAME_FIND_AFFILIATE) == null)
			model.addAttribute(ConstantsHelper.OBJECT_NAME_FIND_AFFILIATE, ConstantsHelper.SOLICITUD_INTERNACION);
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
