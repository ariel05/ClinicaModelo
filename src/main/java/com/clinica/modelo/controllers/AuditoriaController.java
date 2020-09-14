package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuditoriaController {

	@RequestMapping("/solicitudAuditoria")
	public String solicitudAuditoria() {
		
		return "auditoria/solicitudAuditoria";
	}

	@RequestMapping("/consultaAuditoria")
	public String consultaAuditoria() {
		
		return "auditoria/consultaAuditoria";
	}

}
