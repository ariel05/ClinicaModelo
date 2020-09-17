package com.clinica.modelo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clinica.modelo.helper.ConstantsHelper;

@Controller
public class BusquedaAfiliadoController {

	@RequestMapping("/busquedaAfiliado")
	public String buscarAfiliado(Model model, @RequestParam String request) {
		
		if(request.equals(ConstantsHelper.ATENCION_AMBULATORIA))
			return "ambulatorio/atencionAmbulatoria";
		else if(request.equals(ConstantsHelper.SOLICITUD_INTERNACION))
			return "internacion/solicitudInternacion";
		
		return null;
	}
}
