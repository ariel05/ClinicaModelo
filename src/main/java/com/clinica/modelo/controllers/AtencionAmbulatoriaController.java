package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtencionAmbulatoriaController {

	@RequestMapping("/atencionAmbulatoria")
	public String irAtencionAmbulatoria() {
	
		return "ambulatorio/atencionAmbulatoria";
	}
	
}
