package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clinica.modelo.helper.ConstantsHelper;

@Controller
public class AtencionAmbulatoriaController {

	@RequestMapping("/atencionAmbulatoria")
	public String irAtencionAmbulatoria(Model model) {
		
		if(model.getAttribute(ConstantsHelper.OBJECT_NAME_FIND_AFFILIATE) == null)
			model.addAttribute(ConstantsHelper.OBJECT_NAME_FIND_AFFILIATE, ConstantsHelper.ATENCION_AMBULATORIA);
		return "ambulatorio/atencionAmbulatoria";
	}
	
}
